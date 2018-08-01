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
public class Religion extends Fragment {
    View v;

    public Religion() {
    }
    private RecyclerView recyclerview;
    private List<data> lstdata;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.religion, container, false);
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
        lstdata.add(new data(getString(R.string.rn1),getString(R.string.rd1),getString(R.string.rt1),R.drawable.nainadevi));
        lstdata.add(new data(getString(R.string.rn2),getString(R.string.rd2),getString(R.string.rt2),R.drawable.hanuman));
        lstdata.add(new data(getString(R.string.rn3),getString(R.string.rd3),getString(R.string.rt3),R.drawable.kainhidhaam));
        lstdata.add(new data(getString(R.string.rn4),getString(R.string.rd4),getString(R.string.rt4),R.drawable.gurudwarashrisingh));
        lstdata.add(new data(getString(R.string.rn5),getString(R.string.rd5),getString(R.string.rt5),R.drawable.mq));
        lstdata.add(new data(getString(R.string.rn6),getString(R.string.rd6),getString(R.string.rt6),R.drawable.church));
        lstdata.add(new data(getString(R.string.rn7),getString(R.string.rd7),getString(R.string.rt7),R.drawable.mukteshwar));
    }
}
