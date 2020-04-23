package com.example.mobilodev;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        final Button emailButton = (Button) findViewById(R.id.email_button);
        final Button userListButton = (Button) findViewById(R.id.userList_button);
        final Button settingsButton = (Button) findViewById(R.id.userSettings_button);
        final Button sensorsButton = (Button) findViewById(R.id.sensors_button);
        final TextView welcomeMessage=findViewById(R.id.welcome_text);
        final String username=getIntent().getStringExtra("username");
        String temp="Merhaba "+username+" hoşgeldiniz";
        welcomeMessage.setText(temp);
        emailButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent emailIntent =new Intent(MenuActivity.this,EmailActivity.class);
                startActivity(emailIntent);
            }
        });
        userListButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent listIntent =new Intent(MenuActivity.this,ListActivity.class);
                startActivity(listIntent);
            }
        });
        settingsButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent settingsIntent =new Intent(MenuActivity.this,SettingsActivity.class);
                settingsIntent.putExtra("username",username);
                startActivity(settingsIntent);
            }
        });


        sensorsButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent sensorsIntent =new Intent(MenuActivity.this,SensorActivity.class);
                startActivity(sensorsIntent);
            }
        });

    }

}
