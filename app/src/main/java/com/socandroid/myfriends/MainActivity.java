package com.socandroid.myfriends;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ImageView profileImageView;
    TextView nameTextView, departTextView;
    EditText myNameEditText;
    Button changeNameButton;
    RecyclerView mRecyclerView;
    FriendsAdapter friendsAdapter;
    String [] nameOfMyFriends = {"Tayo","Iyanu","Leke","Nahimat"};
    int [] friendPictures = {R.mipmap.the_levarage_pic,R.mipmap.ic_launcher,
            R.mipmap.ic_launcher_round,R.mipmap.the_levarage_pic};
    ArrayList<Friend> friends;
    Context myContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myContext = getBaseContext();
        friends = new ArrayList<>();
        profileImageView = (ImageView) findViewById(R.id.profileImageView);
        nameTextView = (TextView) findViewById(R.id.NameTextView);
        departTextView = (TextView) findViewById(R.id.departmentTextView);
        myNameEditText = (EditText) findViewById(R.id.nameChangeEditText);
        changeNameButton = (Button) findViewById(R.id.change_name_button);
//        nameTextView.setText("SOC ANDROID");

        //what we want the listener to do is to get the text of the EditText and set it to the text of the NameTextView
        changeNameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = myNameEditText.getText().toString();
                nameTextView.setText(name);
            }
        });
        for(int i = 0; i<nameOfMyFriends.length;i++){
            Friend myFriend = new Friend(nameOfMyFriends[i],friendPictures[i]);
            friends.add(myFriend);
        }
        mRecyclerView = (RecyclerView) findViewById(R.id.friends_recycler_view);
        friendsAdapter = new FriendsAdapter(myContext,friends);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setAutoMeasureEnabled(true);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(friendsAdapter);

    }
}
