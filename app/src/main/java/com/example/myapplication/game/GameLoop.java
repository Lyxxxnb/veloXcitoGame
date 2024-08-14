package com.example.myapplication.game;

public class GameLoop
{
    private GameStates _gameState;
    private Thread _gameThread;
    private Update _update;
    private final int GAME_FPS = 20;

    public GameLoop(Update update)
    {
        _update = update;
        _gameThread = new Thread(this::run);
    }

    public void startLoop()
    {
        _gameState = GameStates.RUNNING;
        _gameThread.start();
    }

    public void stopLoop()
    {
        _gameState = GameStates.STOPPED;
    }

    /**
     * Dauerschleife, die
     */
    public void run()
    {
        double timePerFrame = 1000000000 / GAME_FPS;
        double lastFrame = System.nanoTime();
        double now;

        while (true)
        {
            now = System.nanoTime();
            if (now - lastFrame >= timePerFrame)
            {
                _update.update();
                lastFrame = now;
            }
        }
    }


}
