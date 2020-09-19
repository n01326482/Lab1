package com.example.AyobamiOyesanya_CENG319Lab1;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AIActivity extends AppCompatActivity {
    TextView activityTitle, onCreateTextView, onStartTextView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai);

        activityTitle = (TextView) findViewById(R.id.activityTitle);
        activityTitle.setTextSize(24);
        activityTitle.setText("AIActivity:");

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
