package com.example.tim.ppmediaplayeriv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MetalSongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create an ArrayList of songs for Anthrax
        final ArrayList<Songs> songs = new ArrayList<>();
        songs.add(new Songs("Madhouse", "Anthrax", R.drawable.anthrax_metal));
        songs.add(new Songs("A.I.R.", "Anthrax", R.drawable.anthrax_metal));
        songs.add(new Songs("Armed and Dangerous", "Anthrax", R.drawable.anthrax_metal));
        songs.add(new Songs("I am the Law", "Anthrax", R.drawable.anthrax_metal));
        songs.add(new Songs("Indians", "Anthrax", R.drawable.anthrax_metal));
        songs.add(new Songs("Caught in a Mosh", "Anthrax", R.drawable.anthrax_metal));
        songs.add(new Songs("I'm the Man", "Anthrax", R.drawable.anthrax_metal));
        songs.add(new Songs("Antisocial", "Anthrax", R.drawable.anthrax_metal));
        songs.add(new Songs("Belly of the Beast", "Anthrax", R.drawable.anthrax_metal));
        songs.add(new Songs("Got the Time", "Anthrax", R.drawable.anthrax_metal));
        songs.add(new Songs("Keep it in the Family", "Anthrax", R.drawable.anthrax_metal));
        songs.add(new Songs("Bring the Noise\n(Feat. Public Enemy)", "Anthrax", R.drawable.anthrax_metal));


        SongsAdapter songsAdapter = new SongsAdapter(this, songs);

        // Get a reference to the ListView and attach the adapter to the listView
        ListView listView = findViewById(R.id.song_list_list);
        listView.setAdapter(songsAdapter);

        // Make a Toast for the play button
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MetalSongsActivity.this, "I'm bad. I'm so bad. I should be in detention!!",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
