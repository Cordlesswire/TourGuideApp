package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CinemasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinemas);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place("Cinema City", "Gliwicka 44", 4));
        places.add(new Place("Multikino", "3 Maja 30", 3));
        places.add(new Place("Swiatowid", "3 Maja 7", 5));
        places.add(new Place("Cinema City", "Chorzowska 107", 4));
        places.add(new Place("Kosmos", "Sokolska 66", 5));
        places.add(new Place("Rialto", "św. Jana 24", 5));
        PlaceAdapter placeAdapter = new PlaceAdapter(this, places);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(placeAdapter);
    }
}
