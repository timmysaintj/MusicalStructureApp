package com.example.tim.ppmediaplayeriv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CountryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);

        //Get the ImageView for CountrySongsActivity
        ImageView countrySongsImage = findViewById(R.id.country_girls_iv);

        // Setup OnClickListener for CountrySongsActivity
        countrySongsImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent countrySongImageIntent = new Intent(CountryActivity.this, CountrySongsActivity.class);

                // Starts CountryActivity
                startActivity(countrySongImageIntent);
            }
        });

        // Get the TextView Artists name
        TextView countryGirlsArtistView = findViewById(R.id.country_girls_artist_tv);

        // Setup OnClickListener
        countryGirlsArtistView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent countryGirlsArtistIntent = new Intent(CountryActivity.this, CountrySongsActivity.class);

                // Start Activity
                startActivity(countryGirlsArtistIntent);
            }
        });

        // Get the TextView Artists Album name
        TextView countryGirlsAlbumView = findViewById(R.id.country_girls_album_tv);

        // Setup OnClickListener
        countryGirlsAlbumView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent countryGirlsAlbumIntent = new Intent(CountryActivity.this, CountrySongsActivity.class);

                // Start Activity
                startActivity(countryGirlsAlbumIntent);
            }
        });

        // Get imageView for the play button activity_country
        ImageView playButton = findViewById(R.id.country_play_button);

        // Setup OnClickListener for play button
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Make toast for play button
                Toast.makeText(CountryActivity.this, "No Country music yet.", Toast.LENGTH_SHORT).show();
            }
        });

        // Get imageview for the pause button activity_country
        ImageView pauseButton = findViewById(R.id.country_pause_button);

        // Setup OnClickListener for pause button
        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Make toast for pause button
                Toast.makeText(CountryActivity.this, "Yep, Still nothing.", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
