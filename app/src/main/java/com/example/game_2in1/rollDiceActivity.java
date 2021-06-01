package com.example.game_2in1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class rollDiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roll_dice);
        ImageView dice = findViewById(R.id.dice);
        Button roll = findViewById(R.id.roll);
        Random random = new Random();
        roll.setOnClickListener(v -> {
            switch(random.nextInt(7)) {
                case 1:
                    dice.setImageResource(R.mipmap.diceone);
                    break;
                case 2:
                    dice.setImageResource(R.mipmap.dicetwo);
                    break;
                case 3:
                    dice.setImageResource(R.mipmap.dicethree);
                    break;
                case 4:
                    dice.setImageResource(R.mipmap.dicefour);
                    break;
                case 5:
                    dice.setImageResource(R.mipmap.dicefive);
                    break;
                case 6:
                    dice.setImageResource(R.mipmap.dicesix);
                    break;
            }
        });
    }
}