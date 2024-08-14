package com.example.myapplication.game;

/**
 * der GameLoop ist die Klasse, in der die Funktionalität mit der das Spiel geloopt wird festgelegt
 * wird. ImplementationsDetails (Was geloopt wird) soll nicht hier stehen, sondern wird über das
 * funktionale Interace Update über den Konstruktor mitgegeben, sodass diese Funktionalität in der
 * Game Klasse festgelegt werden kann
 */
public class GameLoop
{
    private GameStates _gameState;
    private Thread _gameThread;
    private Update _update;
    private final int GAME_FPS = 60;

    /**
     * der Konstruktor mit dem Parameter Update
     * @param update Interface mit der Methode update(), welche angibt, was geupdated werden soll
     */
    public GameLoop(Update update)
    {
        _update = update;
        _gameThread = new Thread(this::run);
    }

    /**
     * beginnt den Loop
     */
    public void startLoop()
    {
        _gameState = GameStates.RUNNING;
        _gameThread.start();
    }

    /**
     * stoppt den Loop
     */
    public void stopLoop()
    {
        _gameState = GameStates.STOPPED;
    }

    /**
     * Dauerschleife, die das game jeden Frame updatet
     */
    public void run()
    {
        double timePerFrame = 1000000000 / GAME_FPS;
        double lastFrame = System.nanoTime();
        double now;

        while (_gameState == GameStates.RUNNING)
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
