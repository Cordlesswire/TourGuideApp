package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MonumentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monuments);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place("Pomnik Powstańców Sląskich", "Aleja Korfantego 35", 5, R.drawable.pomnik));
        places.add(new Place("Spodek", "Aleja Korfantego 35", 5, R.drawable.spodek));
        PlaceAdapter placeAdapter = new PlaceAdapter(this, places);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(placeAdapter);
    }
}
