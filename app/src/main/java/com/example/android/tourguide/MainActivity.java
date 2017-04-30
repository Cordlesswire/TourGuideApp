package com.example.android.tourguide;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView restaurants = (TextView) findViewById(R.id.RestaurantsTextView);
        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent restaurantsIntent = new Intent(MainActivity.this, RestaurantsActivity.class);
                startActivity(restaurantsIntent);
            }
        });

        TextView cinemas = (TextView) findViewById(R.id.CinemasTextView);
        cinemas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cinemasIntent = new Intent(MainActivity.this, CinemasActivity.class);
                startActivity(cinemasIntent);
            }
        });

        TextView museums = (TextView) findViewById(R.id.MuseumTextView);
        museums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent museumsIntent = new Intent(MainActivity.this, MuseumsActivity.class);
                startActivity(museumsIntent);
            }
        });

        TextView monuments = (TextView) findViewById(R.id.MonumentsTextView);
        monuments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent monumentsIntent = new Intent(MainActivity.this, MonumentsActivity.class);
                startActivity(monumentsIntent);
            }
        });
    }
}
