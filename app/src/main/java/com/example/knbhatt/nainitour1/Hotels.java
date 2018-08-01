package com.example.knbhatt.nainitour1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Hotels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);
        ArrayList<Names> name = new ArrayList<Names>();
        name.add(new Names(getString(R.string.hn1),getString(R.string.hd1),R.drawable.hotelhimalay));
        name.add(new Names(getString(R.string.hn2),getString(R.string.hd2),R.drawable.hotelhappyhome));
        name.add(new Names(getString(R.string.hn3),getString(R.string.hd3),R.drawable.hotelnewbharat));
        name.add(new Names(getString(R.string.hn4),getString(R.string.hd4),R.drawable.hotelsweethome));
        name.add(new Names(getString(R.string.hn5),getString(R.string.hd5),R.drawable.hotelprimrose));
        name.add(new Names(getString(R.string.hn6),getString(R.string.hd6),R.drawable.hotelgreenleaf));
        name.add(new Names(getString(R.string.hn7),getString(R.string.hd7),R.drawable.hotelmanumaharani));
        name.add(new Names(getString(R.string.hn8),getString(R.string.hd8),R.drawable.hotelashok));
        name.add(new Names(getString(R.string.hn9),getString(R.string.hd9),R.drawable.hotelmaharaja));

        NameAdapter adapter = new NameAdapter(this ,name,R.color.colorAccent);
        ListView listview =(ListView)findViewById(R.id.hotellist);
        listview.setAdapter(adapter);
    }
    }

