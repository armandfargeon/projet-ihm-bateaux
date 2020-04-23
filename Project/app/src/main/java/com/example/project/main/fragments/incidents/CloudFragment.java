package com.example.project.main.fragments.incidents;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.project.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class CloudFragment extends Fragment {

    public CloudFragment() {}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_basic_incident, container,false);
        int icon = R.drawable.ic_cloud;
        ((TextView)rootView.findViewById(R.id.incident_name)).setText("Cloud Scale");
        ((ImageView)rootView.findViewById(R.id.img_level1_1)).setImageResource(icon);
        ((ImageView)rootView.findViewById(R.id.img_level2_1)).setImageResource(icon);
        ((ImageView)rootView.findViewById(R.id.img_level2_2)).setImageResource(icon);
        ((ImageView)rootView.findViewById(R.id.img_level3_1)).setImageResource(icon);
        ((ImageView)rootView.findViewById(R.id.img_level3_2)).setImageResource(icon);
        ((ImageView)rootView.findViewById(R.id.img_level3_3)).setImageResource(icon);
        return rootView;
    }
}