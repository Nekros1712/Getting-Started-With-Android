package com.example.game_2in1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView random = findViewById(R.id.randomNumber);
        ImageView roll = findViewById(R.id.rollDice);
        random.setOnClickListener(v -> {
            Intent randomNumber = new Intent(MainActivity.this, randomNumberActivity.class);
            startActivity(randomNumber);
        });
        roll.setOnClickListener(v -> {
            Intent rollDice = new Intent(MainActivity.this, rollDiceActivity.class);
            startActivity(rollDice);
        });
    }
}