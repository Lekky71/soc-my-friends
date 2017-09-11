package com.socandroid.myfriends;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by oluwalekefakorede on 11/09/2017.
 */

public class FriendsAdapter extends RecyclerView.Adapter<FriendsAdapter.FriendsViewHolder> {
    ArrayList<Friend> myFriends; //An arraylist of our friends
    Context mContext; //context

    //this is a constructor
    public FriendsAdapter(Context context, ArrayList<Friend> friends){
        mContext = context;
        myFriends = friends;
    }
    @Override
    public FriendsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.each_friend_view,parent,false);
        return new FriendsViewHolder(view);
    }

    @Override //What this does is to read each index of the arraylist and attach it to the place holder
    public void onBindViewHolder(FriendsViewHolder holder, int position) {
        String friendName = myFriends.get(position).getName();
        int picture = myFriends.get(position).getPictureDrawable();
        holder.friendImageView.setImageResource(picture);
        holder.friendNameTextView.setText(friendName);
    }

    @Override
    public int getItemCount() {
        return myFriends.size();
    }

    public class FriendsViewHolder extends RecyclerView.ViewHolder {
        ImageView friendImageView;
        TextView friendNameTextView;
        public FriendsViewHolder(View itemView) {
            super(itemView);
            friendImageView = itemView.findViewById(R.id.friend_image_view);
            friendNameTextView = itemView.findViewById(R.id.name_of_friend_text_view);
        }
    }
}
