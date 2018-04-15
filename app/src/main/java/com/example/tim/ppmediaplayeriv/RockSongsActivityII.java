package com.example.tim.ppmediaplayeriv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class RockSongsActivityII extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create an ArrayList of songs for Queen
        final ArrayList<Songs> songs = new ArrayList<>();
        songs.add(new Songs("A Kind of Magic", "Queen", R.drawable.queen_rock));
        songs.add(new Songs("Under Pressure", "Queen", R.drawable.queen_rock));
        songs.add(new Songs("Radio Ga Ga", "Queen", R.drawable.queen_rock));
        songs.add(new Songs("I Want it All", "Queen", R.drawable.queen_rock));
        songs.add(new Songs("I Want to Break Free", "Queen", R.drawable.queen_rock));
        songs.add(new Songs("Innuendo", "Queen", R.drawable.queen_rock));
        songs.add(new Songs("It's a Hard Life", "Queen", R.drawable.queen_rock));
        songs.add(new Songs("Breakthru", "Queen", R.drawable.queen_rock));
        songs.add(new Songs("Who Wants to Live\n Forever", "Queen", R.drawable.queen_rock));
        songs.add(new Songs("Headlong", "Queen", R.drawable.queen_rock));
        songs.add(new Songs("The Miracle", "Queen", R.drawable.queen_rock));
        songs.add(new Songs("Hammer to Fall", "Queen", R.drawable.queen_rock));
        songs.add(new Songs("Fat Bottomed Girls", "Queen", R.drawable.queen_rock));

        SongsAdapter songsAdapter = new SongsAdapter(this, songs);

        // Get a reference to the ListView and attach the adapter to the listView
        ListView listView = findViewById(R.id.song_list_list);
        listView.setAdapter(songsAdapter);

        // Make a Toast for the play button
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(RockSongsActivityII.this, "Fat bottomed girls, you make the rocking world go round.",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
