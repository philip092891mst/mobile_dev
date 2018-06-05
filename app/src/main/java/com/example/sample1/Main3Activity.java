package com.example.sample1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.net.HttpURLConnection;
import java.net.URL;

public class Main3Activity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String position = intent.getStringExtra("position");
        String username = intent.getStringExtra("username");
        String password = intent.getStringExtra("password");

        //Bundle extras = getIntent().getExtras();
        //String name = extras.getString("name");
        //String position = extras.getString("position");
        //String username = extras.getString("username");
        //String password = extras.getString("password");



        TextView textView8 = findViewById(R.id.textView8);
        textView8.setText(name);
        //Log.e("log",name);

        TextView textView10 = findViewById(R.id.textView10);
        textView10.setText(position);


        TextView textView16 = findViewById(R.id.textView16);
        textView16.setText(username);

        TextView textView17 = findViewById(R.id.textView17);
        textView17.setText(password);

        Button btnConfirm = (Button)findViewById(R.id.buttonConfirm);
        Button btnBack = (Button)findViewById(R.id.buttonBack);

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                startActivity(new Intent(Main3Activity.this, MainActivity.class));
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                startActivity(new Intent(Main3Activity.this, Main2Activity.class));
            }
        });

    }
}
