package com.example.soundboard;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MoviesActivity extends AppCompatActivity {

    Button chosepoorlyBtn, omgwowBtn, noooBtn, minemineBtn, thisisspartaBtn, iamyourfatherBtn, releasethekrakenBtn, itsatrapBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);

        chosepoorlyBtn = (Button)findViewById(R.id.chosepoorlyBtn);
        omgwowBtn = (Button)findViewById(R.id.omgwowBtn);
        noooBtn = (Button)findViewById(R.id.noooBtn);
        minemineBtn = (Button)findViewById(R.id.minemineBtn);
        thisisspartaBtn = (Button)findViewById(R.id.thisisspartaBtn);
        iamyourfatherBtn = (Button)findViewById(R.id.iamyourfatherBtn);
        releasethekrakenBtn = (Button)findViewById(R.id.releasethekrakenBtn);
        itsatrapBtn = (Button)findViewById(R.id.itsatrapBtn);

        chosepoorlyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(MoviesActivity.this, R.raw.chosepoorly);
                mp.start();
            }
        });

        omgwowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(MoviesActivity.this, R.raw.omgwow);
                mp.start();
            }
        });

        noooBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(MoviesActivity.this, R.raw.nooo);
                mp.start();
            }
        });

        minemineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(MoviesActivity.this, R.raw.minemine);
                mp.start();
            }
        });

        thisisspartaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(MoviesActivity.this, R.raw.thisissparta);
                mp.start();
            }
        });

        iamyourfatherBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(MoviesActivity.this, R.raw.iamyourfather);
                mp.start();
            }
        });

        releasethekrakenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(MoviesActivity.this, R.raw.releasethekraken);
                mp.start();
            }
        });

        itsatrapBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(MoviesActivity.this, R.raw.itsatrap);
                mp.start();
            }
        });


    }
}
