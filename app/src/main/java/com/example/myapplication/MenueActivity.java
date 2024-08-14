package com.example.myapplication;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MenueActivity extends AppCompatActivity
{
    private ImageButton settingsButton;
    private ImageButton startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setTitle("Hallo Welt");
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) ->
        {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        settingsButton = findViewById(R.id.settingsButton);
        startButton = findViewById(R.id.startButton);

        registriereUIAktionen();

    }

    private void testMethod()
    {
        Toast.makeText(this, "Moin Meister", Toast.LENGTH_LONG).show();
    }

    private void oeffneNeueActivity()
    {
        Intent intent = new Intent(this, MultiplayerActivity.class);
        startActivity(intent);
    }
    
    private void registriereUIAktionen()
    {
        settingsButton.setOnClickListener(setting -> oeffneNeueActivity());
        startButton.setOnClickListener(start -> testMethod());

    }

}