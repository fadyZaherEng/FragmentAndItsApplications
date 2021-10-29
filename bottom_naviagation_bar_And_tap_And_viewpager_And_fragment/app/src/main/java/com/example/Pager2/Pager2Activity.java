package com.example.Pager2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.bottom_naviagation_bar_and_tap_and_viewpager_and_fragment.databinding.ActivityPager2Binding;
import com.example.bottom_naviagation_bar_and_tap_and_viewpager_and_fragment.firstFragment;
import com.example.bottom_naviagation_bar_and_tap_and_viewpager_and_fragment.secondFragment;
import com.example.bottom_naviagation_bar_and_tap_and_viewpager_and_fragment.thirdFragment;
import com.google.android.material.tabs.TabLayout;

public class Pager2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityPager2Binding binding=ActivityPager2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Pager2Adapter adapter=new Pager2Adapter(getSupportFragmentManager(),getLifecycle());
        adapter.setTaps(new tab("Home",firstFragment.newInstance("Hello")));
        adapter.setTaps(new tab("Profile",new secondFragment()));
        adapter.setTaps(new tab("Setting",new thirdFragment()));

        binding.pager2.setAdapter(adapter);
        for (tab tab:adapter.getTabs()) {
            binding.tabPager2.addTab(binding.tabPager2.newTab().setText(tab.getTabName()));
        }
        //connect tab with pager choose pager based on tab
        binding.tabPager2.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                binding.pager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        //connect pager with tab choose tab based on pager
        binding.pager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
                binding.tabPager2.selectTab(binding.tabPager2.getTabAt(position));
            }
        });

    }
}