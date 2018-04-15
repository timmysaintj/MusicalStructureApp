package com.example.tim.ppmediaplayeriv;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongsAdapter extends ArrayAdapter<Songs> {

    /**
     * @param context    The current context used to inflate the layout file.
     * @param categories is the list of Artists and Songs.
     */

    public SongsAdapter(Activity context, ArrayList<Songs> categories) {
        // Initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, categories);
    }

    /**
     * Provides a view for an AdapterView
     *
     * @param position    The position of the data that should be displayed in the song item view
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //Check if the existing view is being reused, otherwise inflates the view.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_items, parent, false);
        }

        // Gets the object located at this position on the list.
        Songs currentSong = getItem(position);

        // Find the TextView in the song_items.xml layout with the ID song_item_artist_tv
        TextView artistTextView = listItemView.findViewById(R.id.song_item_artist_tv);

        //Gets the artists name and sets the text on the Artists TextView
        artistTextView.setText(currentSong.getArtistName());

        // Find the TextView in the song_item.xml layout with the ID song_item_song_tv
        TextView songsTextView = listItemView.findViewById(R.id.song_item_song_tv);
        //Gets the song name and stes the text on the Songs TextView
        songsTextView.setText(currentSong.getSongName());

        // Find the ImageView in the song_item.xml layout with the ID song_item_image_iv
        ImageView iconView = listItemView.findViewById(R.id.song_item_image_iv);
        //Get the image resource ID from the current Song object and stes the image to iconView
        iconView.setImageResource(currentSong.getImageResourceId());

        // Returns the whole list item layout (2 TextViews and 1 ImageView)
        return listItemView;
    }
}
