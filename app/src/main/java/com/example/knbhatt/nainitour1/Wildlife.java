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
public class Wildlife extends Fragment {
    View v;
    public Wildlife() {
    }
    private RecyclerView recyclerview;
    private List<data> lstdata;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.wildlife, container, false);
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
        lstdata.add(new data(getString(R.string.w1),getString(R.string.wd1),getString(R.string.wt1),R.drawable.nainitalzoo));
        lstdata.add(new data(getString(R.string.w2),getString(R.string.wd2),getString(R.string.wt2),R.drawable.kilbury));
        lstdata.add(new data(getString(R.string.w3),getString(R.string.wd3),getString(R.string.wt3),R.drawable.soananadi));

    }
}
