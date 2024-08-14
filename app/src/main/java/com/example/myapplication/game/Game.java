package com.example.myapplication.game;

import android.util.Log;

/**
 * Die Main Klasse für das Game, von der aus also Komponenten zusammengefügt und gesteuert werden
 */
public class Game
{
    private GameLoop _gameLoop;

    private int _framesThisSecond;

    private long _lastFrameCheck;

    private Player _player;

    public Game()
    {
        _framesThisSecond = 0;
        _lastFrameCheck = 0;
        _player = new Player();
        _gameLoop = new GameLoop(this::update);
        _gameLoop.startLoop();
    }

    /**
     * Die Update Methode, in der alle Dynamischen Elemente des Spiels aktualisiert werden
     */
    private void update()
    {
        showFPS();
    }

    /**
     * gibt die Anzahl der FPS zurück
     * @return durchschnittliche FPS
     */
    public void showFPS()
    {
        _framesThisSecond++;
        long now = System.currentTimeMillis();
        if (now - _lastFrameCheck >= 1000)
        {
            _lastFrameCheck = now;
            Log.d("FPS", "FPS: " + ((Integer)_framesThisSecond).toString());
            _framesThisSecond = 0;
        }
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
