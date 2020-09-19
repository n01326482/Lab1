package com.example.AyobamiOyesanya_CENG319Lab1;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class VRActivity extends AppCompatActivity {
    TextView lifecycle_tv;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vr);

        lifecycle_tv = (TextView) findViewById(R.id.activityTitle);
        lifecycle_tv.setTextSize(24);
        lifecycle_tv.setText("VRActivity:");

        lifecycle_tv.setText(lifecycle_tv.getText() + "\nOnCreate executed");
    }

    @Override
    protected void onStart() {
        super.onStart();
        lifecycle_tv.setText(lifecycle_tv.getText() + "\nOnStart executed");
    }
}
