package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museums);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place("Muzeum Historii Katowice", "Szafranka 9", 5));
        places.add(new Place("Muzeum Sląskie", "Dobrowolskiego 1", 5));
        places.add(new Place("Centrum Scenografii Polskiej", "plac Sejmu Slaskiego 2", 0));
        places.add(new Place("Muzeum najmniejszych książek", "Traktorzystów 5", 4));
        places.add(new Place("Muzeum misyjne", "Panewnicka 76", 5));
        PlaceAdapter placeAdapter = new PlaceAdapter(this, places);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(placeAdapter);
    }
}
