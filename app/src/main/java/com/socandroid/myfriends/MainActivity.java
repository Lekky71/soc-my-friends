package com.socandroid.myfriends;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView profileImageView;
    TextView nameTextView, departTextView, nameOfFriendsTextView;
    EditText myNameEditText;
    TextView cousemateTextView;
    Button changeNameButton;
    String [] nameOfMyFriends = {"Tayo","Iyanu", "Tope", "Josh","Leke","Nike","Barakat","Nahimat",
            "Princess","Fortune","Eri","Fatimah","Kenny","Bukky"};
    String[] nameCourseMates = {"Segun","Daniel","Dami","Samuel","Grace","Nike","Demola","Ayomide"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        profileImageView = (ImageView) findViewById(R.id.profileImageView);
        nameTextView = (TextView) findViewById(R.id.NameTextView);
        departTextView = (TextView) findViewById(R.id.departmentTextView);
        nameOfFriendsTextView = (TextView) findViewById(R.id.names_of_friends_text_view);
        cousemateTextView = (TextView) findViewById(R.id.name_of_course_mates_text_view);
        myNameEditText = (EditText) findViewById(R.id.nameChangeEditText);
        changeNameButton = (Button) findViewById(R.id.change_name_button);
//        nameTextView.setText("SOC ANDROID");
        for(int i = 0;i<nameOfMyFriends.length;i++){
            nameOfFriendsTextView.setText(nameOfFriendsTextView.getText()+ nameOfMyFriends[i]+"\n");
        }
        for(int i = 0; i< nameCourseMates.length;i++){
           cousemateTextView.setText(cousemateTextView.getText()+ nameCourseMates[i] +"\n");
        }

        //what we want the listener to do is to get the text of the EditText and set it to the text of the NameTextView
        changeNameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = myNameEditText.getText().toString();
                nameTextView.setText(name);
            }
        });
    }
}
