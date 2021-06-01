package com.example.game_2in1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class randomNumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_number);
        TextView txtContent = findViewById(R.id.txt);
        Button btn = findViewById(R.id.btn);
        Random rand = new Random();
        btn.setOnClickListener(v -> txtContent.setText(String.valueOf(rand.nextInt(100))));
    }
}