package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);


        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getResources().getString(R.string.restaurant1), getResources().getString(R.string.restaurant1_address) , 4));
        places.add(new Place(getResources().getString(R.string.restaurant2), getResources().getString(R.string.restaurant2_address), 4));
        PlaceAdapter placeAdapter = new PlaceAdapter(this, places);
        Collections.sort(places,new PlaceComparator());

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(placeAdapter);
    }
}
