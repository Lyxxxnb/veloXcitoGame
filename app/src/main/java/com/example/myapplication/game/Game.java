package com.example.myapplication.game;

import android.util.Log;

/**
 * Die Main Klasse für das Game, von der aus also Komponenten zusammengefügt und gesteuert werden
 */
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

    /**
     * Die Update Methode, in der alle Dynamischen Elemente des Spiels aktualisiert werden
     */
    private void update()
    {
        int frameUpdates = 0;
        long startTime = System.currentTimeMillis();
        int timeElapsed = 0;

        Log.d("test", "Moin Meister");

        //timeElapsed =
        //_averageFPS = frameUpdates /
    }

    /**
     * gibt die Anzahl der FPS zurück
     * @return durchschnittliche FPS
     */
    private double getAverageFPS()
    {
        return _averageFPS;
    }

    /**
     * Pausiert das Spiel (funktioniert momentan nicht)
     */
    //TODO: Methode zum laufen bringen
    public void pauseGame()
    {
        _gameLoop.stopLoop();
    }
}
