package com.example.soundboard;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class GamesActivity extends AppCompatActivity {

    Button  MissionFailedBtn, OoofBtn, fatalityBtn, hadoukenBtn, metalgearsolidalertBtn, inhumanreactionsBtn, marioooofBtn, pootisBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);

        MissionFailedBtn = (Button)findViewById(R.id.MissionFailedBtn);
        OoofBtn = (Button)findViewById(R.id.OoofBtn);
        fatalityBtn = (Button)findViewById(R.id.fatalityBtn);
        hadoukenBtn = (Button)findViewById(R.id.hadoukenBtn);
        metalgearsolidalertBtn = (Button)findViewById(R.id.metalgearsolidalertBtn);
        inhumanreactionsBtn = (Button)findViewById(R.id.inhumanreactionsBtn);
        marioooofBtn = (Button)findViewById(R.id.marioooofBtn);
        pootisBtn = (Button)findViewById(R.id.pootisBtn);


        MissionFailedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(GamesActivity.this, R.raw.missionfailed);
                mp.start();
            }
        });

        OoofBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(GamesActivity.this, R.raw.ooof);
                mp.start();

            }
        });

        fatalityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(GamesActivity.this, R.raw.fatality);
                mp.start();
            }
        });

        hadoukenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(GamesActivity.this, R.raw.hadouken);
                mp.start();
            }
        });

        inhumanreactionsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(GamesActivity.this, R.raw.inhumanreactions);
                mp.start();
            }
        });

        metalgearsolidalertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(GamesActivity.this, R.raw.metalgearsolidalert);
                mp.start();
            }
        });

        marioooofBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(GamesActivity.this, R.raw.marioooof);
                mp.start();
            }
        });

        pootisBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(GamesActivity.this, R.raw.pootis);
                mp.start();
            }
        });


    }
}
