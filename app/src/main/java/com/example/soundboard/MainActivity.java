package com.example.soundboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button GamesBtn, MoviesBtn, PoliticsBtn, ViralBtn, MemesBtn, TelevisionBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GamesBtn = (Button) findViewById(R.id.GamesBtn); //id of Button
        MoviesBtn = (Button) findViewById(R.id.MoviesBtn);
        PoliticsBtn = (Button) findViewById(R.id.PoliticsBtn);
        ViralBtn = (Button) findViewById(R.id.ViralBtn);
        MemesBtn = (Button) findViewById(R.id.MemesBtn);
        TelevisionBtn = (Button) findViewById(R.id.TelevisionBtn);

        GamesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, GamesActivity.class));

                MoviesBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(MainActivity.this, MoviesActivity.class));

                        PoliticsBtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(MainActivity.this, PoliticsActivity.class));

                                ViralBtn.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        startActivity(new Intent(MainActivity.this, ViralActivity.class));

                                        MemesBtn.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                startActivity(new Intent(MainActivity.this, MemesActivity.class));

                                                TelevisionBtn.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        startActivity(new Intent(MainActivity.this, TelevisionActivity.class));


                                                    }
                                                });


                                            }
                                        });
                                    }
                                });
                            }
                        });
                    }
                });
            }
        });
    }
}





