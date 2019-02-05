package com.example.soundboard;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelevisionActivity extends AppCompatActivity {

    Button wrongBtn, dohBtn, ohshitdawgBtn, mrkrabsBtn, jeezrickBtn, mymanBtn, ohnoBtn, willhelmscreamBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_television);

        wrongBtn = (Button)findViewById(R.id.wrongBtn);
        dohBtn = (Button)findViewById(R.id.dohBtn);
        ohshitdawgBtn = (Button)findViewById(R.id.ohshitdawgBtn);
        mrkrabsBtn = (Button)findViewById(R.id.mrkrabsBtn);
        jeezrickBtn = (Button)findViewById(R.id.jeezrickBtn);
        mymanBtn = (Button)findViewById(R.id.mymanBtn);
        ohnoBtn = (Button)findViewById(R.id.ohnoBtn);
        willhelmscreamBtn = (Button)findViewById(R.id.willhelmscreamBtn);

        wrongBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(TelevisionActivity.this, R.raw.wrong);
                mp.start();

            }
        });

        dohBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(TelevisionActivity.this, R.raw.doh);
                mp.start();
            }
        });

        ohshitdawgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(TelevisionActivity.this, R.raw.ohshitdawg);
                mp.start();
            }
        });

        mrkrabsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(TelevisionActivity.this, R.raw.mrkrabs);
                mp.start();
            }
        });

        jeezrickBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(TelevisionActivity.this, R.raw.jeezrick);
                mp.start();
            }
        });

        mymanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(TelevisionActivity.this, R.raw.myman);
                mp.start();
            }
        });

        ohnoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(TelevisionActivity.this, R.raw.ohno);
                mp.start();
            }
        });

        willhelmscreamBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(TelevisionActivity.this, R.raw.wilhelmscream);
                mp.start();
            }
        });
    }

}
