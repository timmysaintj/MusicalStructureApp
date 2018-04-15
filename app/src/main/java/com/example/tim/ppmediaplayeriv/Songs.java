package com.example.tim.ppmediaplayeriv;

public class Songs {

    // Artists Names
    private String mArtistName;

    // Songs Names
    private String mSongNames;

    // Image Resource
    private int mImageResourceId;

    /*
     * Create a new object.
     *
     * @param Artist is the Artists name.
     * @param Song is the albums name.
     * @param imageResourceId is the drawable that corresponds to the Artist and Album.
     */
    public Songs(String Song, String Artist, int imageResourceId) {

        mSongNames = Song;
        mArtistName = Artist;
        mImageResourceId = imageResourceId;
    }

    // Gets the name of the song.
    public String getSongName() {
        return mSongNames;
    }

    // Gets the name of the Artist.
    public String getArtistName() {
        return mArtistName;
    }

    // Gets the image resource ID
    public int getImageResourceId() {
        return mImageResourceId;
    }
}
