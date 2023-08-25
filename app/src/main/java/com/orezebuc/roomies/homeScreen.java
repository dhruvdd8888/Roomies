package com.orezebuc.roomies;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class homeScreen extends AppCompatActivity {
    private verticalViewPager viewPager;
    private viewPagerAdapter viewAdapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        viewPager = (verticalViewPager) findViewById(R.id.view_pager);
        viewAdapter = new viewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(viewAdapter);
    }
}
