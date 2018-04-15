package com.example.tim.ppmediaplayeriv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class CountrySongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create an ArrayList of songs for Country Girls
        final ArrayList<Songs> songs = new ArrayList<>();
        songs.add(new Songs("ฉันชอบกินปลาร้า", "Country Girls", R.drawable.country_girls));
        songs.add(new Songs("เราชอบกินมาก", "Country Girls", R.drawable.country_girls));
        songs.add(new Songs("อาหาร อาหาร อาหาร", "Country Girls", R.drawable.country_girls));
        songs.add(new Songs("ส้มตำทุวัน", "Country Girls", R.drawable.country_girls));
        songs.add(new Songs("มีโคลนติดอยู่ที่นิ้วเท้าฉัน", "Country Girls", R.drawable.country_girls));
        songs.add(new Songs("ควายคือเพือนที่ดี่ที่สุด\nของฉัน", "Country Girls", R.drawable.country_girls));
        songs.add(new Songs("ดำคืนอีสานเหงา", "Country Girls", R.drawable.country_girls));
        songs.add(new Songs("ฉันแค่ต้องการรองเท้า", "Country Girls", R.drawable.country_girls));
        songs.add(new Songs("ตกใจ “You Scare Me”", "Country Girls", R.drawable.country_girls));


        SongsAdapter songsAdapter = new SongsAdapter(this, songs);

        // Get a reference to the ListView and attach the adapter to the listView
        ListView listView = findViewById(R.id.song_list_list);
        listView.setAdapter(songsAdapter);

        // Make a Toast for the play button
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(CountrySongsActivity.this, "Yea!! It's playing!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
