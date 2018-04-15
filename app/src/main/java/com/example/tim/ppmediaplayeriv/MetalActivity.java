package com.example.tim.ppmediaplayeriv;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MetalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metal);

        //Get the ImageView for MetalSongsActivity
        ImageView anthraxSongsImage = findViewById(R.id.anthrax_iv);

        // Setup OnClickListener for MetalSongsActivity
        anthraxSongsImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent anthraxSongImageIntent = new Intent(MetalActivity.this, MetalSongsActivity.class);

                // Starts MetalActivity
                startActivity(anthraxSongImageIntent);
            }
        });

        // Get the TextView Artists name
        TextView anthraxArtistView = findViewById(R.id.anthrax_artist_tv);

        // Setup OnClickListener
        anthraxArtistView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent anthraxArtistIntent = new Intent(MetalActivity.this, MetalSongsActivity.class);

                // Start Activity
                startActivity(anthraxArtistIntent);
            }
        });

        // Get the TextView Artists Album name
        TextView anthraxAlbumView = findViewById(R.id.anthrax_album_tv);

        // Setup OnClickListener
        anthraxAlbumView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent anthraxAlbumIntent = new Intent(MetalActivity.this, MetalSongsActivity.class);

                // Start Activity
                startActivity(anthraxAlbumIntent);
            }
        });

        //Get the ImageView for MetalSongsActivityII
        ImageView fastwaySongsImage = findViewById(R.id.fastway_iv);

        // Setup OnClickListener for MetalSongsActivityII
        fastwaySongsImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fastwaySongImageIntent = new Intent(MetalActivity.this, MetalSongsActivityII.class);

                // Starts MetalSongsActivityII
                startActivity(fastwaySongImageIntent);
            }
        });

        // Get the TextView Artists name
        TextView fastwayArtistView = findViewById(R.id.fastway_artist_tv);

        // Setup OnClickListener
        fastwayArtistView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fastwayArtistIntent = new Intent(MetalActivity.this, MetalSongsActivityII.class);

                // Start Activity
                startActivity(fastwayArtistIntent);
            }
        });

        // Get the TextView Artists Album name
        TextView fastwayAlbumView = findViewById(R.id.fastway_album_tv);

        // Setup OnClickListener
        fastwayAlbumView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fastwayAlbumIntent = new Intent(MetalActivity.this, MetalSongsActivityII.class);

                // Start Activity
                startActivity(fastwayAlbumIntent);
            }
        });

        // Get imageView for the play button activity_main
        ImageView playButton = findViewById(R.id.metal_play_button);

        // Setup OnClickListener for play button
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Make toast for play button
                Toast.makeText(MetalActivity.this, "Playing previous song. Please wait.", Toast.LENGTH_SHORT).show();
            }
        });

        // Get imageview for the pause button activity_main
        ImageView pauseButton = findViewById(R.id.metal_pause_button);

        // Setup OnClickListener for pause button
        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Make toast for pause button
                Toast.makeText(MetalActivity.this, "No! I like this song!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
