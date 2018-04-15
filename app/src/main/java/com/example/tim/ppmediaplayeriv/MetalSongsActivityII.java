package com.example.tim.ppmediaplayeriv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MetalSongsActivityII extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create an ArrayList of songs for Fastway
        final ArrayList<Songs> songs = new ArrayList<>();
        songs.add(new Songs("Easy Living", "Fastway", R.drawable.fastway_metal));
        songs.add(new Songs("Feel Me, Touch Me\n(Do Anything You Want)", "Fastway", R.drawable.fastway_metal));
        songs.add(new Songs("All I Need is Your Love", "Fastway", R.drawable.fastway_metal));
        songs.add(new Songs("Another Day", "Fastway", R.drawable.fastway_metal));
        songs.add(new Songs("Heft!", "Fastway", R.drawable.fastway_metal));
        songs.add(new Songs("We Become One", "Fastway", R.drawable.fastway_metal));
        songs.add(new Songs("Give it All You Got", "Fastway", R.drawable.fastway_metal));
        songs.add(new Songs("Say What You Will", "Fastway", R.drawable.fastway_metal));
        songs.add(new Songs("You Got Me Runnin'", "Fastway", R.drawable.fastway_metal));
        songs.add(new Songs("Give it Some Action", "Fastway", R.drawable.fastway_metal));
        songs.add(new Songs("Far Far From Home", "Fastway", R.drawable.fastway_metal));

        SongsAdapter songsAdapter = new SongsAdapter(this, songs);

        // Get a reference to the ListView and attach the adapter to the listView
        ListView listView = findViewById(R.id.song_list_list);
        listView.setAdapter(songsAdapter);

        // Make a Toast for the play button
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MetalSongsActivityII.this, "Quite a difference from Anthrax.",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
