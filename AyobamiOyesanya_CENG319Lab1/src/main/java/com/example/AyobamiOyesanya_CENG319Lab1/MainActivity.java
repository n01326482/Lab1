package com.example.AyobamiOyesanya_CENG319Lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView activityTitle, onCreateTextView, onStartTextView;
    private int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activityTitle = (TextView) findViewById(R.id.activityTitle);
        activityTitle.setTextSize(24);
        activityTitle.setText("Main Activity:");

        onCreateTextView = (TextView) findViewById(R.id.onCreateTextView);
        onCreateTextView.setTextSize(24);
        onCreateTextView.setText("onCreate "+getString(R.string.on_create_string));

    }


    @Override
    protected void onStart() {
        super.onStart();
        onStartTextView = (TextView) findViewById(R.id.onStartTextView);
        onStartTextView.setTextSize(24);
        onStartTextView.setText(""); // reset when it starts
        onStartTextView.setText("onStart "+getString(R.string.on_start_string));
    }
}