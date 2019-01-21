package com.example.soundboard;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class GamesActivity extends AppCompatActivity {

    ImageButton OfBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);
        OfBtn = (ImageButton) findViewById(R.id.OfBtn);

        OfBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(GamesActivity.this, R.raw.ooof);
                mp.start();
            }
        });
    }
}
