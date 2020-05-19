package cse.hcmut.advance.watchingvideoapp.adapters;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import cse.hcmut.advance.watchingvideoapp.R;
import cse.hcmut.advance.watchingvideoapp.models.MediaModel;
import cse.hcmut.advance.watchingvideoapp.ui.VideoFragment;

import static android.content.ContentValues.TAG;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private Context context;
    private List<MediaModel> elements;
    public String VideoName="";
    public String VideoId="";



    public ListAdapter(Context c, List<MediaModel> list) {
        context=c;
        elements=list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(this.context).inflate(R.layout.layout_list_item, parent, false);

        return new ViewHolder(view);

    }

    @Override
    public int getItemCount() {
        return elements.size();
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        holder.textName.setText(elements.get(position).getMediaTitle());
        holder.textInfo.setText(elements.get(position).getMediaInfo());


        Picasso.get()
                .load(elements.get(position).getMediaThumbnail())
                .into(holder.imgThumbnail);


        holder.itemView.setOnClickListener(new View.OnClickListener(){

            Fragment fragment=null;
            Class fragmentClass= VideoFragment.class;
            String fragmentTag="VideoFragment";

            @Override
            public void onClick(View v){
                VideoId=elements.get(position).getMediaId();
                try{
                    if(VideoId=="001"){VideoName="video1";}
                    else if(VideoId=="002"){VideoName="video2";}
                    else if(VideoId=="003"){VideoName="video3";}
                    else if(VideoId=="004"){VideoName="video4";}
                    else if(VideoId=="005"){VideoName="video5";}
                    else if(VideoId=="006"){VideoName="video6";}
                    else if(VideoId=="007"){VideoName="video7";}
                    else if(VideoId=="008"){VideoName="video8";}
                    else if(VideoId=="009"){VideoName="video9";}
                    else if(VideoId=="010"){VideoName="video10";}
                    else if(VideoId=="011"){VideoName="video11";}
                    else if(VideoId=="012"){VideoName="video12";}
                    else if(VideoId=="013"){VideoName="video13";}
                    else if(VideoId=="014"){VideoName="video14";}
                    else if(VideoId=="015"){VideoName="video15";}

                    fragment = (Fragment) fragmentClass.newInstance();

                    Bundle bundle = new Bundle();

                    bundle.putString("fragmentTag", fragmentTag);
                    bundle.putString("Video_Name", VideoName);

                    fragment.setArguments(bundle);
                    // Insert the fragment by replacing any existing fragment
                    FragmentManager fragmentManager = ((AppCompatActivity)context).getSupportFragmentManager();
                    fragmentManager.beginTransaction().replace(R.id.fragment_fullscreen, fragment).addToBackStack(null).commitAllowingStateLoss();}
                catch(Exception e){
                    Log.e(TAG, "selectFragment " + e.getMessage());
                }
            }
        });
    }



    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView textName;
        TextView textInfo;
        TextView textID;
        ImageView imgThumbnail;



        public ViewHolder(View view) {
            super(view);

            textName = view.findViewById(R.id.txt_media_title);
            textInfo = view.findViewById(R.id.txt_media_info);
            imgThumbnail = view.findViewById(R.id.img_media_thumbnail);
        }

    }


}