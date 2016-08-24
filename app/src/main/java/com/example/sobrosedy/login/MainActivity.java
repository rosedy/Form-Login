package com.example.sobrosedy.login;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText username,password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=(EditText)findViewById(R.id.txt_username);
        password=(EditText) findViewById(R.id.pass);

        Button login=(Button) findViewById(R.id.btn1);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent result=new Intent(MainActivity.this,activity_result.class);
                if(username.getText().toString().equals("user") && password.getText().toString().equals("123")){
                    String name = username.getText().toString();
                    String pass = password.getText().toString();
                    result.putExtra("user ",name);
                    result.putExtra("123 ",pass);

                    startActivity(result);
                }

            }
        });
    }
}
