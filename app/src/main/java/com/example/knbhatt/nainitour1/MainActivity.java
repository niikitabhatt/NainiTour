package com.example.knbhatt.nainitour1;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CustomPagerAdapter mCustomPagerAdapter;
    ViewPager mViewPager;
    LinearLayout about;
    LinearLayout placestovisit;
    LinearLayout hotels;
    LinearLayout restaurants;
    LinearLayout localfood;
    LinearLayout adventure;
    LinearLayout howtoreach;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCustomPagerAdapter = new CustomPagerAdapter(this);
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mCustomPagerAdapter);
        // initiate rating bar and a button
        final RatingBar simpleRatingBar = (RatingBar) findViewById(R.id.simpleRatingBar);
        Button submitButton = (Button) findViewById(R.id.submitButton);
        // perform click event on button
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get values and then displayed in a toast
                String totalStars = "Total Stars:: " + simpleRatingBar.getNumStars();
                String rating = "Rating :: " + simpleRatingBar.getRating();
                Toast.makeText(getApplicationContext(), totalStars + "\n" + rating, Toast.LENGTH_LONG).show();
            }
        });
        about = (LinearLayout)findViewById(R.id.about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this,About.class);
                startActivity(intent1);
            }
        });
        placestovisit = (LinearLayout)findViewById(R.id.placetovisit);
        placestovisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this,PlacesToVisit.class);
                startActivity(intent2);
            }
        });
        hotels = (LinearLayout)findViewById(R.id.hotels);
        hotels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity.this,Hotels.class);
                startActivity(intent3);
            }
        });
        restaurants = (LinearLayout)findViewById(R.id.restaurants);
        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(MainActivity.this,Restaurants.class);
                startActivity(intent4);
            }
        });
        localfood = (LinearLayout)findViewById(R.id.localfood);
        localfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(MainActivity.this,FamousLocalFood.class);
                startActivity(intent5);
            }
        });
        adventure = (LinearLayout)findViewById(R.id.adventure);
        adventure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(MainActivity.this,AdventoursActivity.class);
                startActivity(intent6);
            }
        });
        howtoreach = (LinearLayout)findViewById(R.id.howtoreach);
        howtoreach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7 = new Intent(MainActivity.this,HowToReach.class);
                startActivity(intent7);
            }
        });
    }
    }

