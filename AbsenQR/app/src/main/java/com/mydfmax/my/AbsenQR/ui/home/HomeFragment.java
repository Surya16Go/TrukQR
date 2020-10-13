package com.mydfmax.my.AbsenQR.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.mydfmax.my.AbsenQR.R;

public class HomeFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        Button button = (Button) root.findViewById(R.id.btn_scann);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(HomeFragment.this.getActivity(), ScanFragment.class);
                HomeFragment.this.startActivity(myIntent);
            }
        });
        return root;
    }
}