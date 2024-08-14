package com.example.myapplication.game;

import android.util.Log;

public class Game
{
    private GameLoop _gameLoop;

    private int _averageFPS;

    private Player _player;

    public Game()
    {
        _player = new Player();
        _gameLoop = new GameLoop(this::update);
        _gameLoop.startLoop();
    }

    private void update()
    {
        int frameUpdates = 0;
        long startTime = System.currentTimeMillis();
        int timeElapsed = 0;

        Log.d("test", "Moin Meister");

        //timeElapsed =
        //_averageFPS = frameUpdates /
    }

    private double getAverageFPS()
    {
        return _averageFPS;
    }

    public void pauseGame()
    {
        _gameLoop.stopLoop();
    }
}
