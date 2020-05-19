package cse.hcmut.advance.watchingvideoapp.ui;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.VideoView;

import cse.hcmut.advance.watchingvideoapp.R;


public class VideoFragment extends Fragment {
    ImageButton btnClear;
    String VideoName = "";

    public VideoFragment() {
    }

    public static VideoFragment newInstance() {
        return new VideoFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Bundle bundle=getArguments();
        VideoName=bundle.getString("Video_Name");
        return inflater.inflate(R.layout.fragment_video, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        VideoView videoView = view.findViewById(R.id.video_view);
        videoView.setMediaController(new MediaController(getContext()));
        Uri video = Uri.parse("android.resource://" + getContext().getPackageName() + "/" + "raw/"+VideoName);
        videoView.setVideoURI(video);
        videoView.start();

        btnClear= view.findViewById(R.id.btnClear);
        LinearLayout whole_screen = view.findViewById(R.id.video_fullscreen);

        whole_screen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnClear.setVisibility(View.VISIBLE);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        btnClear.setVisibility(View.INVISIBLE);
                    }
                }, 3000);
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().popBackStack();
            }
        });
    }
}
