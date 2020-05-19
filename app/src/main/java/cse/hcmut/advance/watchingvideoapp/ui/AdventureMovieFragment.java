package cse.hcmut.advance.watchingvideoapp.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v17.leanback.widget.HorizontalGridView;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import cse.hcmut.advance.watchingvideoapp.R;
import cse.hcmut.advance.watchingvideoapp.adapters.ListAdapter;
import cse.hcmut.advance.watchingvideoapp.models.MediaModel;

public class AdventureMovieFragment extends Fragment {

    HorizontalGridView gridViewAdventureMovie;
//    private RecyclerView gridViewAdventureMovie;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_adventuremovie, container, false);


        gridViewAdventureMovie = view.findViewById(R.id.gridViewAdventureMovie);

        List<MediaModel> bList=new ArrayList<>();
        MediaModel b1Media=new MediaModel();
        MediaModel b2Media=new MediaModel();
        MediaModel b3Media=new MediaModel();
        MediaModel b4Media=new MediaModel();
        MediaModel b5Media=new MediaModel();

        b1Media.setMediaTitle("ABIGAIL Trailer (2019)");
        b1Media.setMediaInfo("Fantasy, Adventure Movie HD");
        b1Media.setMediaThumbnail("https://i.ytimg.com/vi/-P9TjzQjUYE/maxresdefault.jpg");
        b1Media.setMediaId("006");

        b2Media.setMediaTitle("Dolittle Trailer #1 (2020)");
        b2Media.setMediaInfo("Movieclips Trailers");
        b2Media.setMediaThumbnail("https://i.ytimg.com/vi/hp-TJ25VC84/maxresdefault.jpg");
        b2Media.setMediaId("007");

        b3Media.setMediaTitle("JUNGLE Official Trailer (2017)");
        b3Media.setMediaInfo("Daniel Radcliffe, Adventure Movie HD");
        b3Media.setMediaThumbnail("https://i.ytimg.com/vi/HgnlaFHTIQw/maxresdefault.jpg");
        b3Media.setMediaId("008");

        b4Media.setMediaTitle("Attraction - Official Movie Trailer (2018)");
        b4Media.setMediaInfo("DARK SKY FILMS");
        b4Media.setMediaThumbnail("https://i.ytimg.com/vi/X5BAGbdKRLE/maxresdefault.jpg");
        b4Media.setMediaId("009");

        b5Media.setMediaTitle("THE MAN WITHOUT GRAVITY Trailer (2019)");
        b5Media.setMediaInfo("Netflix");
        b5Media.setMediaThumbnail("https://i.ytimg.com/vi/wy7uzo_Vlu8/maxresdefault.jpg");
        b5Media.setMediaId("010");

        bList.add(b1Media);
        bList.add(b2Media);
        bList.add(b3Media);
        bList.add(b4Media);
        bList.add(b5Media);

        ListAdapter adapter=new ListAdapter(getActivity(),bList);

        gridViewAdventureMovie.setAdapter(adapter);
        return view;
    }
}
