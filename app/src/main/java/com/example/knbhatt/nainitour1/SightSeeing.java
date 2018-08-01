package com.example.knbhatt.nainitour1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KN Bhatt on 7/25/2018.
 */
public class SightSeeing extends Fragment {
    View v;
    public SightSeeing() {
    }
    private RecyclerView recyclerview;
    private List<data> lstdata;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.sightseeing, container, false);
        recyclerview = (RecyclerView) v.findViewById(R.id.recycleview);
        RecyclerViewAdapter recycleAdapter= new RecyclerViewAdapter(getContext(),lstdata);
        recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerview.setAdapter(recycleAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lstdata= new ArrayList<>();
        lstdata.add(new data(getString(R.string.ssn1),getString(R.string.ssd1),getString(R.string.sst1),R.drawable.tiffintop));
        lstdata.add(new data(getString(R.string.ssn2),getString(R.string.ssd2),getString(R.string.sst2),R.drawable.snowview));
        lstdata.add(new data(getString(R.string.ssn3),getString(R.string.ssd3),getString(R.string.sst3),R.drawable.kalagarh));
        lstdata.add(new data(getString(R.string.ssn4),getString(R.string.ssd4),getString(R.string.sst4),R.drawable.camelsback));
        lstdata.add(new data(getString(R.string.ssn5),getString(R.string.ssd5),getString(R.string.sst5),R.drawable.suspension));
    }
}
