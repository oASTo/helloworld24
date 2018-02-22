package com.example.agung.helloworld24;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText username = (EditText) findViewById(R.id.username_text);
        final EditText password = (EditText) findViewById(R.id.password_text);

        Button loginButton = (Button) findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (username.getText().toString().equals("")){
                    username.setError("Please fill the username");
                }
                if(password.getText().toString().equals("")){
                    password.setError("Please fill the password");
                }
                if(username.getText().toString().equals("admin")&& password.getText().toString().equals("admin")){
                    Intent i = new Intent(getBaseContext(),MenuActivity.class);
                    startActivity(i);
                    finish();
                }
                else{
                    Toast.makeText(
                            getBaseContext(),
                            "Username and password doesn't seem to match",
                            Toast.LENGTH_SHORT
                    ).show();
                }
            }
        });
    }
}
