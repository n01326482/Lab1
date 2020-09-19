package com.example.AyobamiOyesanya_CENG319Lab1;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ListViewFragment extends Fragment implements AdapterView.OnItemClickListener {
    ListView listView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Toast.makeText(getContext(), "ListView "+getString(R.string.on_create_view_toast), Toast.LENGTH_SHORT).show();
        View view = inflater.inflate(R.layout.listview_fragment, container, false);
        listView = (ListView) view.findViewById(R.id.listView);
        String[] subActivities = new String[]{"AIActivity", "VRActivity"};

        // Add an adapter to list view and add on click listeners
        ArrayAdapter listAdapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, subActivities);
        listView.setAdapter(listAdapter);
        listView.setOnItemClickListener(this);

        return view;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = null;
        switch (position){
            case 0:
                intent = new Intent(getActivity(), AIActivity.class);
                startActivity(intent);
                break;
            case 1:
                intent = new Intent(getActivity(), VRActivity.class);
                startActivity(intent);
                break;
            default:
                break;

        }
    }
}
