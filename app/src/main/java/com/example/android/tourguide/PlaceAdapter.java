package com.example.android.tourguide;

import android.app.Activity;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;


public class PlaceAdapter extends ArrayAdapter<Place> {
    private static final String LOG_TAG = PlaceAdapter.class.getSimpleName();
    private Activity context;

    public PlaceAdapter(Activity context, ArrayList<Place> places) {
        super(context, 0, places);
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.text_list_item, parent, false);
        }

        Place currentPlace = getItem(position);
        listItemView.setBackgroundColor(ContextCompat.getColor(context, currentPlace.getColor()));
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        nameTextView.setText(currentPlace.getName());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address);
        addressTextView.setText(currentPlace.getAddress());

        TextView ratingView = (TextView) listItemView.findViewById(R.id.rating);
        ratingView.setText("" + currentPlace.getRating());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageView);
        if (currentPlace.getImage() != 0) {
            imageView.setImageResource(currentPlace.getImage());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }

}
