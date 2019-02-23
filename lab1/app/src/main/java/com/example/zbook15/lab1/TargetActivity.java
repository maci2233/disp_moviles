package com.example.zbook15.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TargetActivity extends AppCompatActivity {

    TextView textSent;
    String textStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);

        textStr = getIntent().getStringExtra("valString");
        textSent = findViewById(R.id.text_targ);
        textSent.setText(textStr);

    }
}
