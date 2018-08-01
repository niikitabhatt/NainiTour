package com.example.knbhatt.nainitour1;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

public class PlacesToVisit extends AppCompatActivity {
    private TabLayout tablayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_to_visit);
        tablayout =(TabLayout)findViewById(R.id.tablayout_id);
        viewPager =(ViewPager)findViewById(R.id.viewpager_id);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.AddFragment(new Leisure(),getString(R.string.l));
        adapter.AddFragment(new Nature(),getString(R.string.Nature));
        adapter.AddFragment(new Religion(),getString(R.string.Religious));
        adapter.AddFragment(new Adventure(),getString(R.string.Adventure));
        adapter.AddFragment(new Wildlife(),getString(R.string.Wildlife));
        adapter.AddFragment(new Shopping(),getString(R.string.Shopping));
        adapter.AddFragment(new SightSeeing(),getString(R.string.SightSeeing));
        viewPager.setAdapter(adapter);
        tablayout.setupWithViewPager(viewPager);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0);

    }
}
