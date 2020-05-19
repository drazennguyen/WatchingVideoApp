package cse.hcmut.advance.watchingvideoapp.ui;

import android.os.Bundle;
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

public class ActionMovieFragment extends Fragment {
    HorizontalGridView gridViewActionMovie;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_actionmovie, container, false);

        gridViewActionMovie=view.findViewById(R.id.gridViewActionMovie);


        List<MediaModel> aList=new ArrayList<>();
        MediaModel a1Media=new MediaModel();
        MediaModel a2Media=new MediaModel();
        MediaModel a3Media=new MediaModel();
        MediaModel a4Media=new MediaModel();
        MediaModel a5Media=new MediaModel();

        a1Media.setMediaTitle("SCOOB! Official Trailer (2020) Scooby Doo Movie");
        a1Media.setMediaInfo("© 2019 - Warner Bros. Pictures\n");
        a1Media.setMediaThumbnail("https://test.amxa.ru/wp-content/uploads/2019/11/1573562175_maxresdefault.jpg");
        a1Media.setMediaId("001");

        a2Media.setMediaTitle("THE SPONGEBOB MOVIE: Sponge on the Run Trailer (2020)");
        a2Media.setMediaInfo("KinoCheck International");
        a2Media.setMediaThumbnail("https://image.phimmoi.net/film/9881/preview.medium.jpg?_v=1575207531");
        a2Media.setMediaId("002");

        a3Media.setMediaTitle("PENINSULA Official Trailer (2020) Train to Busan 2 Zombie Movie");
        a3Media.setMediaInfo("© 2020 - Well Go USA Entertainment");
        a3Media.setMediaThumbnail("https://img.youtube.com/vi/ADhvLEVpXCs/maxresdefault.jpg");
        a3Media.setMediaId("003");

        a4Media.setMediaTitle("ALONE Official Trailer (2020)");
        a4Media.setMediaInfo("Zombie Horror");
        a4Media.setMediaThumbnail("https://i2.wp.com/moviesandmania.com/wp-content/uploads/2019/11/Alone-movie-film-horror-infection-zombie-outbreak-2020-Tyler-Posey-with-gun.jpg?resize=768%2C320&ssl=1");
        a4Media.setMediaId("004");

        a5Media.setMediaTitle("The Passage (FOX) Trailer HD");
        a5Media.setMediaInfo("Mark-Paul Gosselaar series");
        a5Media.setMediaThumbnail("https://i.ytimg.com/vi/HJRv6tSSSAc/maxresdefault.jpg");
        a5Media.setMediaId("005");

        aList.add(a1Media);
        aList.add(a2Media);
        aList.add(a3Media);
        aList.add(a4Media);
        aList.add(a5Media);

        ListAdapter adapter=new ListAdapter(getActivity(),aList);

        gridViewActionMovie.setAdapter(adapter);
        return view;
    }
}
