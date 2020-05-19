package cse.hcmut.advance.watchingvideoapp.adapters;

import android.widget.ImageView;

import cse.hcmut.advance.watchingvideoapp.models.Movie;

public interface MovieItemClickListener {

    void onMovieClick(Movie movie, ImageView movieImageView); // we will need the imageview to make the shared animation between the two activity

}
