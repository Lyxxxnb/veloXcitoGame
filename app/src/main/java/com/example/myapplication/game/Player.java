package com.example.myapplication.game;

/**
 * Bietet die Funktionalität hinter dem Spieler
 */
public class Player
{
    private double _xPos;
    private double _yPos;


    public Player()
    {
        _xPos = 0;
        _yPos = 0;
    }

    /**
     *  Dummy Methode zum Testen der Update Methode
     */
    public void walk()
    {
        _xPos += 0.001;
    }
}
