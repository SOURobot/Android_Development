package com.example.autorisation;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView space1 = (TextView) findViewById(R.id.space1);
        TextView space2 = (TextView) findViewById(R.id.space2);

        MaterialButton back = (MaterialButton) findViewById(R.id.back);

        Intent intent = getIntent();
        String username = intent.getStringExtra("Username");
        String password = intent.getStringExtra("Password");

        space1.setText(String.format("Username: %s", username));
        space2.setText(String.format("Password: %s", password));

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}