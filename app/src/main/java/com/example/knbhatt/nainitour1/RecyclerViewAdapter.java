package com.example.knbhatt.nainitour1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by KN Bhatt on 7/25/2018.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    Context mContext;
    List<data> mdata;

    public RecyclerViewAdapter(Context mContext, List<data> mdata) {
        this.mContext = mContext;
        this.mdata = mdata;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.layoutptv, parent, false);
        MyViewHolder vHolder = new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tv_placename.setText(mdata.get(position).getPlacename());
        holder.tv_address.setText(mdata.get(position).getAddress());
        holder.tv_timing.setText(mdata.get(position).getTiming());
        holder.img.setImageResource(mdata.get(position).getImage());
    }




    @Override
    public int getItemCount() {
        return mdata.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_placename;
        private TextView tv_address;
        private TextView tv_timing;
        private ImageView img;

        public MyViewHolder(View itemView) {
            super(itemView);
            tv_placename = (TextView) itemView.findViewById(R.id.placename);
            tv_address = (TextView) itemView.findViewById(R.id.address);
            tv_timing = (TextView) itemView.findViewById(R.id.timing);
            img = (ImageView) itemView.findViewById(R.id.nainiimage);

        }
    }}
