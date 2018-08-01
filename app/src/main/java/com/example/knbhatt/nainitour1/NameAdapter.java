package com.example.knbhatt.nainitour1;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class NameAdapter extends ArrayAdapter<Names> {


    private int mColorResourceId;
    public NameAdapter(Activity context, ArrayList<Names> name,int colorResourceId){
        super(context,0, name );
        mColorResourceId=colorResourceId;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View nameItemView = convertView;
        if (nameItemView == null) {
            nameItemView = LayoutInflater.from(getContext()).inflate(R.layout.listlayout, parent, false);
        }
        Names currentName = getItem(position);

        TextView nameTextView = (TextView) nameItemView.findViewById(R.id.activityname);
        nameTextView.setText(currentName.getMnameTranslation());

        TextView relationTextView = (TextView) nameItemView.findViewById(R.id.activitydescription);
        relationTextView.setText(currentName.getMrelationTranslation());

        ImageView imageView = (ImageView) nameItemView.findViewById(R.id.activityimage);
        if (currentName.hasImage()) {

            imageView.setImageResource(currentName.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }
        return nameItemView;
    }
}
