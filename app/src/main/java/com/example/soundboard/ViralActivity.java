package com.example.soundboard;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ViralActivity extends AppCompatActivity {

    Button naniBtn, windowsstartupBtn, mmwatchasayBtn, babycomebackBtn, takemymoneyBtn, damagedcodaBtn, illuminatiBtn, imafirinmalazorBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viral);

        naniBtn = (Button)findViewById(R.id.naniBtn);
        windowsstartupBtn = (Button)findViewById(R.id.windowsstartupBtn);
        mmwatchasayBtn = (Button)findViewById(R.id.mmwatchasayBtn);
        babycomebackBtn = (Button)findViewById(R.id.babycomebackBtn);
        takemymoneyBtn = (Button)findViewById(R.id.takemymoneyBtn);
        damagedcodaBtn = (Button)findViewById(R.id.damagedcodaBtn);
        illuminatiBtn = (Button)findViewById(R.id.illuminatiBtn);
        imafirinmalazorBtn = (Button)findViewById(R.id.imafirinmalazorBtn);

        naniBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(ViralActivity.this, R.raw.nani);
                mp.start();
            }
        });

        windowsstartupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(ViralActivity.this, R.raw.windowsstartup);
                mp.start();
            }
        });

        mmwatchasayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(ViralActivity.this, R.raw.mmwatchasay);
                mp.start();
            }
        });

        babycomebackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(ViralActivity.this, R.raw.babycomeback);
                mp.start();
            }
        });

        takemymoneyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(ViralActivity.this, R.raw.takemymoney);
                mp.start();
            }
        });

        damagedcodaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(ViralActivity.this, R.raw.damagedcoda);
                mp.start();
            }
        });

        illuminatiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(ViralActivity.this, R.raw.illuminati);
                mp.start();
            }
        });

        imafirinmalazorBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(ViralActivity.this, R.raw.imafirinmalazor);
                mp.start();
            }
        });

    }
}
