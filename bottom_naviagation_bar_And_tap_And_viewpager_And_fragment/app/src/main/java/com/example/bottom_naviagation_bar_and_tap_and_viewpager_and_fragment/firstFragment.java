package com.example.bottom_naviagation_bar_and_tap_and_viewpager_and_fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.Pager1.tabbedActivity;


public class firstFragment extends Fragment {
    private static final String ARG_PARAM1 = "param1";

    private String mParam1="Default Hello";

    public firstFragment() {
        // Required empty public constructor
    }


    public static firstFragment newInstance(String param1) {
        firstFragment fragment = new firstFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_first, container, false);
        Toast.makeText(getActivity(), mParam1, Toast.LENGTH_SHORT).show();
        view.findViewById(R.id.f_tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),tabbedActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}