package com.example.soundboard;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MemesActivity extends AppCompatActivity {

    Button bruhBtn, carelesswhisperBtn, epicsaxguyBtn, hellodarknessBtn, itwasatthismomentBtn, rickrollBtn, runningin90SBtn, tobecontinuedBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memes);

        bruhBtn = (Button) findViewById(R.id.bruhBtn);
        carelesswhisperBtn = (Button) findViewById(R.id.carelesswhisperBtn);
        epicsaxguyBtn = (Button) findViewById(R.id.epicsaxguyBtn);
        hellodarknessBtn = (Button) findViewById(R.id.hellodarknessBtn);
        itwasatthismomentBtn = (Button) findViewById(R.id.itwasatthismomentBtn);
        rickrollBtn = (Button) findViewById(R.id.rickrollBtn);
        runningin90SBtn = (Button) findViewById(R.id.runningin90sBtn);
        tobecontinuedBtn = (Button) findViewById(R.id.tobecontinuedBtn);

        bruhBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(MemesActivity.this, R.raw.bruh);
                mp.start();
            }
        });

        carelesswhisperBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(MemesActivity.this, R.raw.carelesswhisper);
                mp.start();
            }
        });

        epicsaxguyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(MemesActivity.this, R.raw.epicsaxguy);
                mp.start();
            }
        });

        hellodarknessBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(MemesActivity.this, R.raw.hellodarkness);
                mp.start();
            }
        });

        itwasatthismomentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(MemesActivity.this, R.raw.itwasatthismoment);
                mp.start();
            }
        });

        rickrollBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        runningin90SBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(MemesActivity.this, R.raw.runningin90s);
                mp.start();
            }
        });

        tobecontinuedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(MemesActivity.this, R.raw.tobecontinued);
                mp.start();
            }
        });

    }
}


