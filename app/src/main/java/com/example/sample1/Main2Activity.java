package com.example.sample1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String position = intent.getStringExtra("position");

        TextView textView4 = findViewById(R.id.textView4);
        textView4.setText(name);
        TextView textView5 = findViewById(R.id.textView5);
        textView5.setText(position);

        /*Button btnSubmit = (Button) findViewById(R.id.buttonSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Main2Activity.this, Main3Activity.class));
            }
        });*/


        Button btnBack = (Button) findViewById(R.id.buttonBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Main2Activity.this, MainActivity.class));
            }
        });
    }


    public void sendMessage(View view)
    {
        Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
        Bundle extras = new Bundle();
        EditText editText3 = (EditText) findViewById(R.id.editText3);
        String username = editText3.getText().toString();
        EditText editText4 = (EditText) findViewById(R.id.editText4);
        String password = editText4.getText().toString();
        EditText editText5 = (EditText) findViewById(R.id.editText5);
        String conpass = editText5.getText().toString();
        TextView textView4 = (TextView) findViewById(R.id.textView4);
        String name = textView4.getText().toString();
        TextView textView5 = (TextView) findViewById(R.id.textView5);
        String position = textView5.getText().toString();
        if(username.length()<=5){
            editText3.requestFocus();
            editText3.setError("Username must consist of at least 5 characters");
        }
        else if(password.length()<=5){
            editText4.requestFocus();
            editText4.setError("Password must be at least 6 characters or above");
        }
        else if(!password.equals(conpass)){
            editText5.requestFocus();
            editText5.setError("Password does not match");
        }
        else{
            extras.putString("username", username);
            extras.putString("password", password);
            extras.putString("conpass", conpass);
            //extras.putString("name", myData[0]);
            //extras.putString("position", myData[1]);
            extras.putString("name", name);
            extras.putString("position", position);
            intent.putExtras(extras);
            startActivity(intent);
        }

    }

}
