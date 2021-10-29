package com.example.Pager2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import java.util.ArrayList;

public class Pager2Adapter extends FragmentStateAdapter
{
   ArrayList<tab>tabs=new ArrayList<>();
    public void setTaps(tab tap) {
        tabs.add(tap);
    }

    public ArrayList<tab> getTabs() {
        return tabs;
    }


    public Pager2Adapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return tabs.get(position).getFragment();
    }
    @Override
    public int getItemCount() {
        return tabs.size();
    }
}
