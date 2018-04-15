package com.example.tim.ppmediaplayeriv;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class IndieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indie);

        //Get the ImageView for IndieSongsActivity
        ImageView indieSongsImage = findViewById(R.id.lagwagon_iv);

        // Setup OnClickListener for IndieSongsActivity
        indieSongsImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent indieSongImageIntent = new Intent(IndieActivity.this, IndieSongsActivity.class);

                // Starts IndieActivity
                startActivity(indieSongImageIntent);
            }
        });

        // Get the TextView Artists name
        TextView lagwagonArtistView = findViewById(R.id.lagwagon_artist_tv);

        // Setup OnClickListener
        lagwagonArtistView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lagwagonArtistIntent = new Intent(IndieActivity.this, IndieSongsActivity.class);

                // Start Activity
                startActivity(lagwagonArtistIntent);
            }
        });

        // Get the TextView Artists Album name
        TextView lagwagonAlbumView = findViewById(R.id.lagwagon_album_tv);

        // Setup OnClickListener
        lagwagonAlbumView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lagwagonAlbumIntent = new Intent(IndieActivity.this, IndieSongsActivity.class);

                // Start Activity
                startActivity(lagwagonAlbumIntent);
            }
        });

        // Get imageView for the play button activity_indie
        ImageView playButton = findViewById(R.id.indie_play_button);

        // Setup OnClickListener for play button
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Make toast for play button
                Toast.makeText(IndieActivity.this, "Indie music hasn't arrived yet.", Toast.LENGTH_SHORT).show();
            }
        });

        // Get imageview for the pause button activity_main
        ImageView pauseButton = findViewById(R.id.indie_pause_button);

        // Setup OnClickListener for pause button
        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Make toast for pause button
                Toast.makeText(IndieActivity.this, "No pausing, I'm not playing yet.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
