package com.example.knbhatt.nainitour1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FamousLocalFood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_famous_local_food);
        ArrayList<Names> name = new ArrayList<Names>();
        name.add(new Names(getString(R.string.lfname1) , getString(R.string.lfdesc1),R.drawable.raas));
        name.add(new Names(getString(R.string.lfname2),getString(R.string.lfdesc2),R.drawable.bhattkichurkani));
        name.add(new Names(getString(R.string.lfname3),getString(R.string.lfdesc3),R.drawable.pahadibadi));
        name.add(new Names(getString(R.string.lfname4),getString(R.string.lfdesc4),R.drawable.baalmithai));



        NameAdapter adapter = new NameAdapter(this ,name,R.color.colorAccent);
        ListView listview =(ListView)findViewById(R.id.foodlist);
        listview.setAdapter(adapter);
    }
}
