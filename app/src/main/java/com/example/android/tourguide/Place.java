package com.example.android.tourguide;

import android.graphics.Color;
import android.media.Image;

/**
 * Created by 1 on 30.04.2017.
 */

public class Place {
    private String mName;
    private String mAddress;
    private int mRating;
    private int mColor;
    private int image;

    public Place(String name, String address, int rating, int image) {
        this.mName = name;
        this.mAddress = address;
        this.mRating = rating;
        this.image = image;
        switch (rating) {
            case 0:
            case 1:
            case 2:
                this.mColor = R.color.badRatingColor;
                break;
            case 3:
            case 4:
                this.mColor = R.color.mediumRatingColor;
                break;
            case 5:
                this.mColor = R.color.goodRatingColor;
                break;
            default:
                this.mColor = R.color.badRatingColor;
                break;
        }
    }

    public Place(String name, String address, int rating) {
        this(name, address, rating, 0);
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getRating() {
        return mRating;
    }

    public void setRating(int Rating) {
        this.mRating = Rating;
    }

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String Address) {
        this.mAddress = Address;
    }

    public String getName() {
        return mName;
    }

    public void setName(String Name) {
        this.mName = Name;
    }

    public int getColor() {
        return mColor;
    }

    public void setColor(int Color) {
        this.mColor = Color;
    }
}
