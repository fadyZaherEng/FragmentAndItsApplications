package com.example.bottom_naviagation_bar_and_tap_and_viewpager_and_fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.Pager2.Pager2Activity;
import com.example.bottom_naviagation_bar_and_tap_and_viewpager_and_fragment.databinding.FragmentSecondBinding;
import com.example.Pager2.*;

public class secondFragment extends Fragment {

    public secondFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentSecondBinding binding=FragmentSecondBinding.inflate(inflater,container,false);

        binding.sTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(requireContext(),Pager2Activity.class);
                requireContext().startActivity(intent);
            }
        });

        return binding.getRoot();
    }
}