package com.example.Pager1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.bottom_naviagation_bar_and_tap_and_viewpager_and_fragment.R;
import com.example.bottom_naviagation_bar_and_tap_and_viewpager_and_fragment.firstFragment;
import com.example.bottom_naviagation_bar_and_tap_and_viewpager_and_fragment.secondFragment;
import com.example.bottom_naviagation_bar_and_tap_and_viewpager_and_fragment.thirdFragment;
import com.google.android.material.tabs.TabLayout;

public class tabbedActivity extends AppCompatActivity {
    TabLayout tab;
    ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabbed);
        tab = findViewById(R.id.tab);
        pager = findViewById(R.id.pager);
        tab.setupWithViewPager(pager);

        PagerAdapter adapter=new PagerAdapter(getSupportFragmentManager());
        adapter.AddTab(new tab("Home",new firstFragment()));
        adapter.AddTab(new tab("Profile",new secondFragment()));
        adapter.AddTab(new tab("Setting",new thirdFragment()));
        pager.setAdapter(adapter);

        tab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }
}