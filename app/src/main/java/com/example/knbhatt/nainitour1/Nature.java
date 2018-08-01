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
public class Nature extends Fragment {
    View v;
    public Nature() {
    }
    private RecyclerView recyclerview;
    private List<data> lstdata;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.nature, container, false);
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
        lstdata.add(new data(getString(R.string.nn1),getString(R.string.nd1),getString(R.string.nt1),R.drawable.nainapeak));
        lstdata.add(new data(getString(R.string.nn2),getString(R.string.nd2),getString(R.string.nt2),R.drawable.sattal));
        lstdata.add(new data(getString(R.string.nn3),getString(R.string.nd3),getString(R.string.nt3),R.drawable.khurpataljpg));
        lstdata.add(new data(getString(R.string.nn4),getString(R.string.nd4),getString(R.string.nt4),R.drawable.sariyatal));
        lstdata.add(new data(getString(R.string.nn5),getString(R.string.nd5),getString(R.string.nt5),R.drawable.botanicalgarden));
    }
}
