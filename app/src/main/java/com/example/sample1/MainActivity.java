package com.example.sample1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Button btn = (Button)findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
            }
        }); */
    }

    public void sendMessage(View view)
    {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        Bundle extras = new Bundle();
        EditText editText = (EditText) findViewById(R.id.editText);
        String name = editText.getText().toString();
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        String position = editText2.getText().toString();
        /*if(!name.trim().equals("")){
            editText.requestFocus();
        }
        */
        if(name.length()==0){
            editText.requestFocus();
            editText.setError("Field cannot be empty");
        }
        /*else if(!name.matches("[a-zA-A]+")){
            editText.requestFocus();
            editText.setError("Name must not contain numbers or symbols");
        }*/
        else if(name.length()>30){
            editText.requestFocus();
            editText.setError("Name must not exceed 30 characters");
        }
        else if(name.length()<=1){
            editText.requestFocus();
            editText.setError("Name must contain at least 2 characters");
        }
        else if(position.length()==0){
            editText2.requestFocus();
            editText2.setError("Field cannot be empty");
        }
        /*else if(!position.matches("[a-zA-A]+")){
            editText2.requestFocus();
            editText2.setError("position must not contain numbers or symbols");
        }*/
        else if(position.length()>30){
            editText2.requestFocus();
            editText2.setError("position must not exceed 30 characters");
        }
        else if(position.length()<=1){
            editText2.requestFocus();
            editText2.setError("position must contain at least 2 characters");
        }
        else{
            extras.putString("name", name);
            extras.putString("position", position);
            intent.putExtras(extras);
            startActivity(intent);
        }

    }

    /*public void sendMessage(View view) {
        Intent intent = new Intent(MainActivity.this, DisplayMessageActivity.class);
        Bundle extras = new Bundle();
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        EditText secondText = (EditText) findViewById(R.id.secondText);
        String secondmessage = secondText.getText().toString();
        extras.putString("editText", message);
        extras.putString("secondText", secondmessage);
        intent.putExtras(extras);
        startActivity(intent);
    } */


}
