package com.example.brom.activitiesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MountainDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountaindetails);

        Intent intent = getIntent();
        String mountainName = intent.getStringExtra("mountainName");
        // String mountainLocation = intent.getStringExtra("mountainLocation");
        String mountainHeight = intent.getStringExtra("mountainHeight");

        TextView textView = (TextView) findViewById(R.id.mountainName);
        textView.setText(mountainName);

        /*TextView textView2 = (TextView) findViewById(R.id.mountainLocation);
        textView2.setText(mountainLocation);*/

        TextView textViewHeight = (TextView) findViewById(R.id.mountainHeight);
        textViewHeight.setText(mountainHeight);

    }
}
