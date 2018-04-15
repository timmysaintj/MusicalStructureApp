package com.example.tim.ppmediaplayeriv;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get textview for CountryActivity
        TextView genreCountry = findViewById(R.id.genre_country_tv);

        // Setup OnClickListener for CountryActivity
        genreCountry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent countryIntent = new Intent(MainActivity.this, CountryActivity.class);

                // Start CountryActivity Intent
                startActivity(countryIntent);
            }
        });

        // Get textview for IndieActivity
        TextView genreIndie = findViewById(R.id.genre_indie_tv);

        // Setup OnClickListener for IndieActivity
        genreIndie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent indieIntent = new Intent(MainActivity.this, IndieActivity.class);

                // Start IndieActivity Intent
                startActivity(indieIntent);
            }
        });

        // Get textview for MetalActivity
        TextView genreMetal = findViewById(R.id.genre_metal_tv);

        // Setup OnClickListener for MetalActivity
        genreMetal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent metalIntent = new Intent(MainActivity.this, MetalActivity.class);

                // Start MetalActivity Intent
                startActivity(metalIntent);
            }
        });

        // Get textview for RockActivity
        TextView genreRock = findViewById(R.id.genre_rock_tv);

        // Setup OnClickListener for RockActivity
        genreRock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rockIntent = new Intent(MainActivity.this, RockActivity.class);

                // Start CountryActivity Intent
                startActivity(rockIntent);
            }
        });

        // Get imageview for the play button activity_main
        ImageView playButton = findViewById(R.id.genre_play_button);

        // Setup OnClickListener for play button
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Make toast for play button
                Toast.makeText(MainActivity.this, "Sorry, there is nothing to play right now.", Toast.LENGTH_SHORT).show();
            }
        });

        // Get imageview for the pause button activity_main
        ImageView pauseButton = findViewById(R.id.genre_pause_button);

        // Setup OnClickListener for pause button
        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Make toast for pause button
                Toast.makeText(MainActivity.this, "Nothing to pause. Sorry.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
