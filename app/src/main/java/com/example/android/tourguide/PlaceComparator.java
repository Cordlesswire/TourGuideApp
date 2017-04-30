package com.example.android.tourguide;

import java.util.Comparator;

/**
 * Created by 1 on 30.04.2017.
 */

public class PlaceComparator implements Comparator<Place> {

        public int compare(Place left, Place right) {
            if(left.getRating() > right.getRating())
            return -1;
            if(left.getRating() < right.getRating())
                return 1;
            return 0;
    }
}

