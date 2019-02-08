package com.example.zbook15.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Bundle info = getIntent().getExtras();
        String msg = info.getString("input");

        TextView new_text = (TextView) findViewById(R.id.text2);
        new_text.setText(msg);

    }



}
