package com.example.AyobamiOyesanya_CENG319Lab1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class LifeCycleFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Toast.makeText(getContext(), "LifeCycle "+getString(R.string.on_create_view_toast), Toast.LENGTH_SHORT).show();
        View view = inflater.inflate(R.layout.lifecycle_fragment, container, false);

        return view;
    }
}
