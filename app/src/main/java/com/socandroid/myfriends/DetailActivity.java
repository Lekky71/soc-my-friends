package com.socandroid.myfriends;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    ImageView friendImageView;
    TextView friendNameTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        friendImageView = (ImageView) findViewById(R.id.friend_detail_image);
        friendNameTextView = (TextView) findViewById(R.id.friend_detail_name);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Bundle receivedBundle = getIntent().getBundleExtra("bundle");
        if(receivedBundle != null){
            String name = receivedBundle.getString("name");
            int pic = receivedBundle.getInt("picture");
            friendImageView.setImageResource(pic);
            friendNameTextView.setText(name);
        }

    }
}
