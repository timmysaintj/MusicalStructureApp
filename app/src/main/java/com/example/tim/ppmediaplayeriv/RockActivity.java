package com.example.tim.ppmediaplayeriv;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class RockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock);

        //Get the ImageView for RockSongsActivity
        ImageView ledZepplinSongsImage = findViewById(R.id.led_zepplin_iv);

        // Setup OnClickListener for RockSongsActivity
        ledZepplinSongsImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ledZepplinSongImageIntent = new Intent(RockActivity.this, RockSongsActivity.class);

                // Starts MetalActivity
                startActivity(ledZepplinSongImageIntent);
            }
        });

        // Get the TextView Artists name
        TextView ledZepplinArtistView = findViewById(R.id.led_zepplin_artist_tv);

        // Setup OnClickListener
        ledZepplinArtistView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ledZepplinArtistIntent = new Intent(RockActivity.this, RockSongsActivity.class);

                // Start Activity
                startActivity(ledZepplinArtistIntent);
            }
        });

        // Get the TextView Artists Album name
        TextView ledZepplinAlbumView = findViewById(R.id.led_zepplin_album_tv);

        // Setup OnClickListener
        ledZepplinAlbumView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ledZepplinAlbumIntent = new Intent(RockActivity.this, RockSongsActivity.class);

                // Start Activity
                startActivity(ledZepplinAlbumIntent);
            }
        });

        //Get the ImageView for RockSongsActivityII
        ImageView queenSongsImage = findViewById(R.id.queen_iv);

        // Setup OnClickListener for RockSongsActivityII
        queenSongsImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent queenSongImageIntent = new Intent(RockActivity.this, RockSongsActivityII.class);

                // Starts RockSongsActivityII
                startActivity(queenSongImageIntent);
            }
        });

        // Get the TextView Artists name
        TextView queenArtistView = findViewById(R.id.queen_artist_tv);

        // Setup OnClickListener
        queenArtistView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent queenArtistIntent = new Intent(RockActivity.this, RockSongsActivityII.class);

                // Start Activity
                startActivity(queenArtistIntent);
            }
        });

        // Get the TextView Artists Album name
        TextView queenAlbumView = findViewById(R.id.queen_album_tv);

        // Setup OnClickListener
        queenAlbumView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent queenAlbumIntent = new Intent(RockActivity.this, RockSongsActivityII.class);

                // Start Activity
                startActivity(queenAlbumIntent);
            }
        });

        // Get imageView for the play button activity_main
        ImageView playButton = findViewById(R.id.rock_play_button);

        // Setup OnClickListener for play button
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Make toast for play button
                Toast.makeText(RockActivity.this, "Playing Under Pressure now. Relax.",
                        Toast.LENGTH_SHORT).show();
            }
        });

        // Get imageview for the pause button activity_main
        ImageView pauseButton = findViewById(R.id.rock_pause_button);

        // Setup OnClickListener for pause button
        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Make toast for pause button
                Toast.makeText(RockActivity.this, "You can't stop Rock & Roll!!",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
