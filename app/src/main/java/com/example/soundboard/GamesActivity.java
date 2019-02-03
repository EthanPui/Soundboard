package com.example.soundboard;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class GamesActivity extends AppCompatActivity {

    Button  MissionFailedBtn, OoofBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);

        MissionFailedBtn = (Button)findViewById(R.id.MissionFailedBtn);
        OoofBtn = (Button)findViewById(R.id.OoofBtn);

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

    }
}
