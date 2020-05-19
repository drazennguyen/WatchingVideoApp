package cse.hcmut.advance.watchingvideoapp.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;

import cse.hcmut.advance.watchingvideoapp.R;

public class MainActivity extends AppCompatActivity implements View.OnFocusChangeListener {

    private ImageButton btnVoice, btnSetting, btnStar, btnActionMovie, btnAdventureMovie, btnDocumentaryMovie, btnFavorite;
    private TextView txtVoiceStatus, txtSettingStatus, txtStarStatus, txtActionMovieStatus, txtAdventureMovieStatus, txtDocumentaryMovieStatus, txtFavoriteStatus;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnVoice = findViewById(R.id.btnVoice);
        btnSetting = findViewById(R.id.btnSetting);
        btnStar = findViewById(R.id.btnStar);
        btnActionMovie = findViewById(R.id.btnActionMovie);
        btnAdventureMovie = findViewById(R.id.btnAdventureMovie);
        btnDocumentaryMovie = findViewById(R.id.btnDocumentaryMovie);
        btnFavorite = findViewById(R.id.btnFavorite);

        txtVoiceStatus = findViewById(R.id.txtVoiceStatus);
        txtSettingStatus = findViewById(R.id.txtSettingStatus);
        txtStarStatus = findViewById(R.id.txtStarStatus);
        txtActionMovieStatus = findViewById(R.id.txtActionMovieStatus);
        txtAdventureMovieStatus = findViewById(R.id.txtAdventureMovieStatus);
        txtDocumentaryMovieStatus = findViewById(R.id.txtDocumentaryMovieStatus);
        txtFavoriteStatus = findViewById(R.id.txtFavoriteStatus);

        btnVoice.setOnFocusChangeListener(this);
        btnSetting.setOnFocusChangeListener(this);
        btnStar.setOnFocusChangeListener(this);
        btnActionMovie.setOnFocusChangeListener(this);
        btnAdventureMovie.setOnFocusChangeListener(this);
        btnDocumentaryMovie.setOnFocusChangeListener(this);
        btnFavorite.setOnFocusChangeListener(this);

        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


    }


    @Override
    public void onFocusChange(View v, boolean hasFocus) {
        if(v.getId() == R.id.btnVoice){
            if(hasFocus) {
                txtVoiceStatus.setVisibility(View.VISIBLE);
                selectFragment(0);
            }
            else txtVoiceStatus.setVisibility(View.INVISIBLE);
        }

        if(v.getId() == R.id.btnStar){
            if(hasFocus) {
                txtStarStatus.setVisibility(View.VISIBLE);
                selectFragment(1);
            }
            else txtStarStatus.setVisibility(View.INVISIBLE);
        }

        if(v.getId() == R.id.btnActionMovie){
            if(hasFocus) {
                txtActionMovieStatus.setVisibility(View.VISIBLE);
                selectFragment(2);
            }
            else txtActionMovieStatus.setVisibility(View.INVISIBLE);
        }

        if(v.getId() == R.id.btnAdventureMovie){
            if(hasFocus) {
                txtAdventureMovieStatus.setVisibility(View.VISIBLE);
                selectFragment(3);
            }
            else txtAdventureMovieStatus.setVisibility(View.INVISIBLE);
        }

        if(v.getId() == R.id.btnDocumentaryMovie){
            if(hasFocus) {
                txtDocumentaryMovieStatus.setVisibility(View.VISIBLE);
                selectFragment(4);
            }
            else txtDocumentaryMovieStatus.setVisibility(View.INVISIBLE);
        }

        if(v.getId() == R.id.btnFavorite){
            if(hasFocus) {
                txtFavoriteStatus.setVisibility(View.VISIBLE);
                selectFragment(5);
            }
            else txtFavoriteStatus.setVisibility(View.INVISIBLE);
        }

        if(v.getId() == R.id.btnSetting){
            if(hasFocus){
                txtSettingStatus.setVisibility(View.VISIBLE);
                selectFragment(6);
            }
            else txtSettingStatus.setVisibility(View.INVISIBLE);
        }

    }

    Fragment fragment;
    String fragmentTag = "";

    private void selectFragment(int position){
        Class fragmentClass = null;
        switch (position) {
            case 0:
                fragmentClass = HomeFragment.class;
                fragmentTag = "HomeFragment";
                break;

            case 1:
                fragmentClass = PopularFragment.class;
                fragmentTag = "PopularFragment";
                break;

            case 2:
                fragmentClass = ActionMovieFragment.class;
                fragmentTag = "ActionMovieFragment";
                break;

            case 3:
                fragmentClass = AdventureMovieFragment.class;
                fragmentTag = "AdventureMovieFragment";
                break;

            case 4:
                fragmentClass = DocumentaryMovieFragment.class;
                fragmentTag = "DocumentaryMovieFragment";
                break;

            case 5:
                fragmentClass = FavoriteFragment.class;
                fragmentTag = "FavoriteFragment";
                break;

            case 6:
                fragmentClass = SettingFragment.class;
                fragmentTag = "SettingFragment";
                break;

            default:
                break;
        }

        try {
            fragment = (Fragment) fragmentClass.newInstance();
            Bundle bundle = new Bundle();
            bundle.putString("fragmentTag", fragmentTag);


            fragment.setArguments(bundle);
            // Insert the fragment by replacing any existing fragment
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment_content, fragment).addToBackStack(fragmentTag).commitAllowingStateLoss();
        } catch (Exception e) {
//            Log.e(TAG, "selectFragment " + e.getMessage());
        }
    }
}
