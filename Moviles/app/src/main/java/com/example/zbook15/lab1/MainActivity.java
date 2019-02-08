package com.example.zbook15.lab1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button button = (Button) findViewById(R.id.button);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){

        EditText text = (EditText) findViewById(R.id.editText);
        String msg = text.getText().toString();

        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra( "input", msg);
        startActivity(intent);
    }

}
