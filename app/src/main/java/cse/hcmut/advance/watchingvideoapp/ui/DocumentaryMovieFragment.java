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

public class DocumentaryMovieFragment extends Fragment {

    HorizontalGridView gridViewDocumentaryMovie;
//    private RecyclerView gridViewDocumentaryMovie;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_documentarymovie, container, false);


        gridViewDocumentaryMovie = view.findViewById(R.id.gridViewDocumentaryMovie);


        List<MediaModel> cList=new ArrayList<>();
        MediaModel c1Media=new MediaModel();
        MediaModel c2Media=new MediaModel();
        MediaModel c3Media=new MediaModel();
        MediaModel c4Media=new MediaModel();
        MediaModel c5Media=new MediaModel();

        c1Media.setMediaTitle("Human Official Trailer 1 (2016)");
        c1Media.setMediaInfo("Documentary");
        c1Media.setMediaThumbnail("https://i.ytimg.com/vi/Ky0LDCtXeDc/maxresdefault.jpg");
        c1Media.setMediaId("011");

        c2Media.setMediaTitle("MAGNUS Official Trailer");
        c2Media.setMediaInfo("Magnus Carlsen Documentary [HD]");
        c2Media.setMediaThumbnail("https://i.ytimg.com/vi/e1jMolJFnLc/maxresdefault.jpg");
        c2Media.setMediaId("012");

        c3Media.setMediaTitle("About Time Official Trailer #1 (2013)");
        c3Media.setMediaInfo("Rachel McAdams Movie HD");
        c3Media.setMediaThumbnail("https://i.ytimg.com/vi/lgyaCwRCrDg/maxresdefault.jpg");
        c3Media.setMediaId("013");

        c4Media.setMediaTitle("Arrival Trailer (2016)");
        c4Media.setMediaInfo("Paramount Pictures");
        c4Media.setMediaThumbnail("https://i.ytimg.com/vi/tFMo3UJ4B4g/maxresdefault.jpg");
        c4Media.setMediaId("014");

        c5Media.setMediaTitle("American Factory | Official Trailer  ");
        c5Media.setMediaInfo("Netflix");
        c5Media.setMediaThumbnail("https://occ-0-1722-1723.1.nflxso.net/dnm/api/v6/6AYY37jfdO6hpXcMjf9Yu5cnmO0/AAAABXWtviGoOUxgrfZf6TL-e4oKs5sJ1mnnQYds3bwbask3IHd-N0SVvgTfiVx94Xtm0DOXnvo-FMqfeJd4u5aU8RebZUhy.jpg?r=d48");
        c5Media.setMediaId("015");

        cList.add(c1Media);
        cList.add(c2Media);
        cList.add(c3Media);
        cList.add(c4Media);
        cList.add(c5Media);

        ListAdapter adapter=new ListAdapter(getActivity(),cList);


        gridViewDocumentaryMovie.setAdapter(adapter);
        return view;
    }
}
