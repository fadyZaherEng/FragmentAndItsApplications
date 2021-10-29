package com.example.bottom_naviagation_bar_and_tap_and_viewpager_and_fragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainerView;

import android.app.Fragment;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView BNV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BNV=findViewById(R.id.bnv);

        getSupportFragmentManager().beginTransaction().replace(R.id.Container,new firstFragment()).commit();
        BNV.setSelectedItemId(R.id.home);

        BNV.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment=null;
                switch (item.getItemId())
                {
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.Container,new firstFragment()).commit();

                        break;
                    case R.id.profile:
                        getSupportFragmentManager().beginTransaction().replace(R.id.Container,new secondFragment()).commit();

                        break;
                    case R.id.setting:
                        getSupportFragmentManager().beginTransaction().replace(R.id.Container,new thirdFragment()).commit();
                        break;
                }
                return true;
            }
        });


    }
}