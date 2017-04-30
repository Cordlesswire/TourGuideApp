package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class MuseumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museums);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getResources().getString(R.string.museum1), getResources().getString(R.string.museum1_address), 5));
        places.add(new Place(getResources().getString(R.string.museum1), getResources().getString(R.string.museum1_address), 5));

        PlaceAdapter placeAdapter = new PlaceAdapter(this, places);
        Collections.sort(places,new PlaceComparator());

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(placeAdapter);
    }
}
