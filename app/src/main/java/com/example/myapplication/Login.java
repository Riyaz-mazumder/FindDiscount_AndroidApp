package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText name, pass;
    TextView goToSinUp;
    Button btn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

         name = findViewById(R.id.name);
         pass = findViewById(R.id.password);

         btn = findViewById(R.id.signUp);

         goToSinUp = findViewById(R.id.dontHaveAccount);

         goToSinUp.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 Intent intent = new Intent(Login.this, SignUp.class);
                 startActivity(intent);
             }
         });

         btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 String userName = name.getText().toString();
                 String password = pass.getText().toString();

                 System.out.println("Name: " +userName + " Password: "+ password);

                 Toast.makeText(getApplicationContext(), "user name: " + userName + " Password : " + password, Toast.LENGTH_SHORT ).show();
             }
         });

    }

    public void login(){

    }
}