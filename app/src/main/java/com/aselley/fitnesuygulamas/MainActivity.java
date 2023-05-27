package com.aselley.fitnesuygulamas;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.widget.TableLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.aselley.fitnesuygulamas.fFragment.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    TableLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.main_activity_view_pager);
        tabLayout = findViewById(R.id.main_activity_tab_layout);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(adapter);
        tabLayout.getWidth();
    }
}