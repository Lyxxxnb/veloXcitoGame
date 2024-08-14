package com.example.myapplication.game;

public class Player
{
    private double _xPos;
    private double _yPos;


    public Player()
    {
        _xPos = 0;
        _yPos = 0;
    }

    public void walk()
    {
        _xPos += 0.001;
    }
}
