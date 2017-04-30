package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class MonumentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monuments);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getResources().getString(R.string.monument1), getResources().getString(R.string.monument1_address), 5, R.drawable.pomnik));
        places.add(new Place(getResources().getString(R.string.monument1), getResources().getString(R.string.monument1_address), 5, R.drawable.spodek));
        PlaceAdapter placeAdapter = new PlaceAdapter(this, places);
        Collections.sort(places,new PlaceComparator());
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(placeAdapter);
    }
}
