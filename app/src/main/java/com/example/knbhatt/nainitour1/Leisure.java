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
public class Leisure extends Fragment {
    View v;
    public Leisure() {
    }
    private RecyclerView recyclerview;
    private List<data> lstdata;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.leisure, container, false);
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
        lstdata.add(new data(getString(R.string.ln1),getString(R.string.ld1),getString(R.string.lt1),R.drawable.nainilake));
        lstdata.add(new data(getString(R.string.ln2),getString(R.string.ld2),getString(R.string.lt2),R.drawable.gurneyhouse));
        lstdata.add(new data(getString(R.string.ln3),getString(R.string.ld3),getString(R.string.lt3),R.drawable.governorhouse));
        lstdata.add(new data(getString(R.string.ln4),getString(R.string.ld4),getString(R.string.lt4),R.drawable.sonapani));



    }
}
