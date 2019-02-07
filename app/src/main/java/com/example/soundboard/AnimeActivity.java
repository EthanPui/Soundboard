package com.example.soundboard;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AnimeActivity extends AppCompatActivity {

    Button kamehamehaBtn, over9000Btn, pikachuthunderboltBtn, wowBtn, objectionBtn, falconpunchBtn, nanisoreBtn, sorearuBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anime);

        kamehamehaBtn = (Button)findViewById(R.id.kamehamehaBtn);
        over9000Btn = (Button)findViewById(R.id.over9000Btn);
        pikachuthunderboltBtn = (Button)findViewById(R.id.pikachuthunderboltBtn);
        wowBtn = (Button)findViewById(R.id.wowBtn);
        objectionBtn = (Button)findViewById(R.id.objectionBtn);
        falconpunchBtn = (Button)findViewById(R.id.falconpunchBtn);
        nanisoreBtn = (Button)findViewById(R.id.nanisoreeBtn);
        sorearuBtn = (Button)findViewById(R.id.sorearuBtn);

        kamehamehaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(AnimeActivity.this, R.raw.kamehameha);
                mp.start();
            }
        });

        over9000Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(AnimeActivity.this, R.raw.over9000);
                mp.start();
            }
        });

        pikachuthunderboltBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(AnimeActivity.this, R.raw.pikachuthunderbolt);
                mp.start();
            }
        });

        wowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(AnimeActivity.this, R.raw.wow);
                mp.start();
            }
        });

        objectionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(AnimeActivity.this, R.raw.objection);
                mp.start();
            }
        });

        falconpunchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(AnimeActivity.this, R.raw.falconpunch);
                mp.start();
            }
        });

        nanisoreBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(AnimeActivity.this, R.raw.nanisoree);
                mp.start();
            }
        });

        sorearuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(AnimeActivity.this, R.raw.sorearu);
                mp.start();
            }
        });

    }
}



