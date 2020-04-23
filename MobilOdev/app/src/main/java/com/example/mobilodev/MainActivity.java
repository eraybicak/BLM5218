package com.example.mobilodev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //setContentView(R.layout.activity_main)
        final EditText uname =(EditText) findViewById(R.id.username_edittext);
        final EditText passwd =(EditText) findViewById(R.id.password_edittext);
        final Button loginButton = (Button) findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(checkPassword(uname.getText().toString(),passwd.getText().toString())){

                    Toast.makeText(getApplicationContext(), "Başarıyla giriş yaptınız", Toast.LENGTH_SHORT).show();
                    Intent menuIntent =new Intent(MainActivity.this,MenuActivity.class);
                    menuIntent.putExtra("username",uname.getText().toString());
                    startActivity(menuIntent);
                }
                else{

                    Toast.makeText(getApplicationContext(), "Hatalı giriş yaptınız", Toast.LENGTH_LONG).show();
                    uname.setText("");
                    passwd.setText("");
                }
            }
        });
    }
    private boolean checkPassword(String uname, String passwd){
        ArrayList<Person> userData=Person.getData();
        for (Person p : userData)
        {
            if(p.getUserName().equals(uname) && p.getUserPassword().equals(passwd)){
                return true;
            }
        }
        return false;

    }
}
