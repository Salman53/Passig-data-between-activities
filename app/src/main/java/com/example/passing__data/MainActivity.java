package com.example.passing__data;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText editText1 , editText2;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.edit_txt_username);
        editText2 = findViewById(R.id.edit_txt_password);
        button = findViewById(R.id.btn1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editText1.getText().toString();
                String password = editText2.getText().toString();

                if(username.equals("") || password.equals(""))
                {
                    Toast.makeText(getApplicationContext() , "Please Complete Fields..." , Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent = new Intent(MainActivity.this , SecondActivity.class);
                    intent.putExtra("username" ,username);
                    intent.putExtra("password" ,password);
                    startActivity(intent);
                    finish();
                }
            }
        });



    }
}