package com.example.knbhatt.nainitour1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class AdventoursActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adventours);

        ArrayList<Names> name = new ArrayList<Names>();
        name.add(new Names(getString(R.string.adventurename1) ,getString(R.string.adventureDescription1),R.drawable.boating));
        name.add(new Names(getString(R.string.adventurename2),getString(R.string.adventureDescription2),R.drawable.trekking));
        name.add(new Names(getString(R.string.adventurename3),getString(R.string.adventureDescription3),R.drawable.rockclimbing));
        name.add(new Names(getString(R.string.adventurename4),getString(R.string.adventureDescription4),R.drawable.rivercrossing));
        name.add(new Names(getString(R.string.adventurename5),getString(R.string.adventureDescription5),R.drawable.zorbing));
        name.add(new Names(getString(R.string.adventurename6),getString(R.string.adventureDescription6),R.drawable.rappelling));
        name.add(new Names(getString(R.string.adventurename7),getString(R.string.adventureDescription7),R.drawable.horseriding));
        name.add(new Names(getString(R.string.adventurename8),getString(R.string.adventureDescription8),R.drawable.paragliding));


        NameAdapter adapter = new NameAdapter(this ,name,R.color.colorAccent);
        ListView listview =(ListView)findViewById(R.id.list);
        listview.setAdapter(adapter);
    }
}
