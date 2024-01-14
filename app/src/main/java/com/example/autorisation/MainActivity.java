package com.example.autorisation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username =(TextView) findViewById(R.id.username);
        TextView password =(TextView) findViewById(R.id.password);

        MaterialButton login = (MaterialButton) findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(username.getText().toString().equals("") || password.getText().toString().equals(""))) {
                    // String message = String.format("Login: %s, Password: %s", username.getText().toString(), password.getText().toString());
                    // Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("Username", username.getText().toString());
                    intent.putExtra("Password", password.getText().toString());
                    startActivity(intent);

                } else {
                    Toast.makeText(MainActivity.this, "FAIL", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}