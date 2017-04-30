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
        places.add(new Place("Zaklęty Czardasz", "Kopernika 9", 4));
        places.add(new Place("Belcanto", "Ligocka 103", 4));
        places.add(new Place("Via Toscana", "Uniwersytecka 13", 5));
        places.add(new Place("Villa Rosa", "Armii Krajowej 153", 3));
        places.add(new Place("Centaur", "Armii Krajowej 66", 5));
        PlaceAdapter placeAdapter = new PlaceAdapter(this, places);
        Collections.sort(places,new PlaceComparator());

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(placeAdapter);
    }
}
