package com.example.tim.ppmediaplayeriv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class IndieSongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create an ArrayList of songs for Lagwagon
        final ArrayList<Songs> songs = new ArrayList<>();
        songs.add(new Songs("Kids Don't Like to Share", "Lagwagon", R.drawable.lagwagon_indie));
        songs.add(new Songs("Violins", "Lagwagon", R.drawable.lagwagon_indie));
        songs.add(new Songs("Name Dropping", "Lagwagon", R.drawable.lagwagon_indie));
        songs.add(new Songs("Bombs Away", "Lagwagon", R.drawable.lagwagon_indie));
        songs.add(new Songs("Move the Car", "Lagwagon", R.drawable.lagwagon_indie));
        songs.add(new Songs("Sleep", "Lagwagon", R.drawable.lagwagon_indie));
        songs.add(new Songs("Sick", "Lagwagon", R.drawable.lagwagon_indie));
        songs.add(new Songs("Rifle", "Lagwagon", R.drawable.lagwagon_indie));
        songs.add(new Songs("Weak", "Lagwagon", R.drawable.lagwagon_indie));
        songs.add(new Songs("Black Eye", "Lagwagon", R.drawable.lagwagon_indie));


        SongsAdapter songsAdapter = new SongsAdapter(this, songs);

        // Get a reference to the ListView and attach the adapter to the listView
        ListView listView = findViewById(R.id.song_list_list);
        listView.setAdapter(songsAdapter);

        // Make a Toast for the play button
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(IndieSongsActivity.this, "Yeah, Lagwagon baby!!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
