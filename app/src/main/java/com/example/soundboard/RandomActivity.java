package com.example.soundboard;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class RandomActivity extends AppCompatActivity {

    ImageButton OfBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);
        OfBtn = (ImageButton) findViewById(R.id.OfBtn);

        OfBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(RandomActivity.this,R.raw.ooof);
                        mp.start();
            }
        });


    }
}
