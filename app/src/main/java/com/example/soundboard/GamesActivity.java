package com.example.soundboard;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class GamesActivity extends AppCompatActivity {

    Button  MissionFailedBtn, OoofBtn, fatalityBtn, hadoukenBtn, kamehamehaBtn, metalgearsolidalertBtn, naniBtn, over9000Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);

        MissionFailedBtn = (Button)findViewById(R.id.MissionFailedBtn);
        OoofBtn = (Button)findViewById(R.id.OoofBtn);
        fatalityBtn = (Button)findViewById(R.id.fatalityBtn);
        hadoukenBtn = (Button)findViewById(R.id.hadoukenBtn);
        kamehamehaBtn = (Button)findViewById(R.id.kamehamehaBtn);
        metalgearsolidalertBtn = (Button)findViewById(R.id.metalgearsolidalertBtn);
        naniBtn = (Button)findViewById(R.id.naniBtn);
        over9000Btn = (Button)findViewById(R.id.over9000Btn);

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

        kamehamehaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(GamesActivity.this, R.raw.kamehameha);
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

        naniBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(GamesActivity.this, R.raw.nani);
                mp.start();
            }
        });

        over9000Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(GamesActivity.this, R.raw.over9000);
                mp.start();
            }
        });


    }
}
