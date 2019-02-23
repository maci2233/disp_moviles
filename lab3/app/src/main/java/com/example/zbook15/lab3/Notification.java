package com.example.zbook15.lab3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Notification extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        String strVar = getIntent().getStringExtra("extra");
        TextView text = findViewById(R.id.textView);
        text.setText(strVar);

    }
}
