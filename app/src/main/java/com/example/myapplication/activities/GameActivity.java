package com.example.myapplication.activities;

import android.os.Bundle;
import android.widget.Button;

import com.example.myapplication.R;
import com.example.myapplication.game.Game;

public class GameActivity extends SuperActivity
{
    private Game _game;
    private Button _testButton;
    public GameActivity()
    {
        _contentView = R.layout.activity_game;
        _game = new Game();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void initializeComponents()
    {
        _testButton = findViewById(R.id.testButton);
    }

    @Override
    protected void registerUIActions()
    {
        _testButton.setOnClickListener(click -> _game.pauseGame());
    }
}