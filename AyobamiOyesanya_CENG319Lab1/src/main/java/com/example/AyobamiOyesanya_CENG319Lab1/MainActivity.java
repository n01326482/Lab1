package com.example.AyobamiOyesanya_CENG319Lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView lifecycle_tv;
    private int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lifecycle_tv = (TextView) findViewById(R.id.activityTitle);
        lifecycle_tv.setTextSize(24);
        lifecycle_tv.setText("Main Activity:");

        lifecycle_tv.setText(lifecycle_tv.getText() + "\nOnCreate executed");
    }


    @Override
    protected void onStart() {
        super.onStart();
        if(i++ < 1){
            lifecycle_tv.setText(lifecycle_tv.getText() + "\nOnStart executed");
        }
    }
}