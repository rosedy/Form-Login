package com.example.sobrosedy.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class activity_result extends AppCompatActivity {
    TextView username;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_result);

        username= (TextView) findViewById(R.id.txt1);

        Intent result = getIntent();
        String name = result.getStringExtra("user");
        result.getExtras();



    }

}
