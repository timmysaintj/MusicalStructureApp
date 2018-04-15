package com.example.tim.ppmediaplayeriv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class RockSongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create an ArrayList of songs for Led Zepplin
        final ArrayList<Songs> songs = new ArrayList<>();
        songs.add(new Songs("We're Gonna Groove", "Led Zepplin", R.drawable.led_zepplin_rock));
        songs.add(new Songs("Poor Tom", "Led Zepplin", R.drawable.led_zepplin_rock));
        songs.add(new Songs("I Can't Quit You Baby", "Led Zepplin", R.drawable.led_zepplin_rock));
        songs.add(new Songs("Walter's Talk", "Led Zepplin", R.drawable.led_zepplin_rock));
        songs.add(new Songs("Ozone Baby", "Led Zepplin", R.drawable.led_zepplin_rock));
        songs.add(new Songs("Darlene", "Led Zepplin", R.drawable.led_zepplin_rock));
        songs.add(new Songs("Bonzo's Montreux", "Led Zepplin", R.drawable.led_zepplin_rock));
        songs.add(new Songs("Wearing and Tearing", "Led Zepplin", R.drawable.led_zepplin_rock));

        SongsAdapter songsAdapter = new SongsAdapter(this, songs);

        // Get a reference to the ListView and attach the adapter to the listView
        ListView listView = findViewById(R.id.song_list_list);
        listView.setAdapter(songsAdapter);

        // Make a Toast for the play button
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(RockSongsActivity.this, "Yeah! Let's get the Led out", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
