package com.example.android.tourguide;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class CinemasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinemas);

        View titleView = getWindow().findViewById(android.R.id.title);
        if (titleView != null) {
            ViewParent parent = titleView.getParent();
            if (parent != null && (parent instanceof View)) {
                View parentView = (View) parent;
                parentView.setBackgroundColor(getResources().getColor(R.color.cinemasColor));
            }
        }

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getResources().getString(R.string.cinema1), getResources().getString(R.string.cinema1_address), 4));
        places.add(new Place(getResources().getString(R.string.cinema1), getResources().getString(R.string.cinema1_address), 3));
        places.add(new Place(getResources().getString(R.string.cinema1), getResources().getString(R.string.cinema1_address), 5));
        Collections.sort(places,new PlaceComparator());
        PlaceAdapter placeAdapter = new PlaceAdapter(this, places);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(placeAdapter);
    }
}
