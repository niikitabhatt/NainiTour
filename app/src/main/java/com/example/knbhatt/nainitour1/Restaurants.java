package com.example.knbhatt.nainitour1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Restaurants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);
        ArrayList<Names> name = new ArrayList<Names>();
        name.add(new Names(getString(R.string.rtn1),getString(R.string.rtd1),R.drawable.giannas));
        name.add(new Names(getString(R.string.rtn2),getString(R.string.rtd2) ,R.drawable.sakle));
        name.add(new Names(getString(R.string.rtn3),getString(R.string.rtd3),R.drawable.machan));
        name.add(new Names(getString(R.string.rtn4),getString(R.string.rtd4),R.drawable.zoobi));
        name.add(new Names(getString(R.string.rtn5),getString(R.string.rtd5),R.drawable.cafechika));
        name.add(new Names(getString(R.string.rtn6),getString(R.string.rtd6),R.drawable.nanak));
        name.add(new Names(getString(R.string.rtn7),getString(R.string.rtd7),R.drawable.sherepunjab));
        name.add(new Names(getString(R.string.rtn8),getString(R.string.rtd8),R.drawable.chandanichowk));
        name.add(new Names(getString(R.string.rtn9),getString(R.string.rtd9),R.drawable.honeyhut));
        name.add(new Names(getString(R.string.rtn10),getString(R.string.rtd10),R.drawable.embassy));
        name.add(new Names(getString(R.string.rtn11),getString(R.string.rtd11),R.drawable.royal));
        name.add(new Names(getString(R.string.rtn12),getString(R.string.rtd12),R.drawable.shiva));

        NameAdapter adapter = new NameAdapter(this ,name,R.color.colorAccent);
        ListView listview =(ListView)findViewById(R.id.restaurantslist);
        listview.setAdapter(adapter);
    }
}
