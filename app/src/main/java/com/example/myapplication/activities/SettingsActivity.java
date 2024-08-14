package com.example.myapplication.activities;

import android.os.Bundle;

import com.example.myapplication.R;

/**
 * Activity auf der Die Einstellungen zu sehen sind
 */
public class SettingsActivity extends SuperActivity
{

    public SettingsActivity()
    {
        _contentView = R.layout.activity_settings;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void initializeComponents()
    {

    }

    @Override
    protected void registerUIActions()
    {

    }
}