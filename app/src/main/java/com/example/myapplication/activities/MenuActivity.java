package com.example.myapplication.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import com.example.myapplication.R;


public class MenuActivity extends SuperActivity
{
    private ImageButton settingsButton;
    private ImageButton startButton;

    public MenuActivity()
    {
        _contentView = R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    @Override
    protected void initializeComponents()
    {
        settingsButton = findViewById(R.id.settingsButton);
        startButton = findViewById(R.id.startButton);
    }

    @Override
    protected void registerUIActions()
    {
        settingsButton.setOnClickListener(setting -> openSettings());
        startButton.setOnClickListener(start -> openGame());
    }

    private void openGame()
    {
        Intent gameIntent = new Intent(this, GameActivity.class);
        startActivity(gameIntent);
    }

    private void openSettings()
    {
        Intent settingsIntent = new Intent(this, SettingsActivity.class);
        startActivity(settingsIntent);
    }

}