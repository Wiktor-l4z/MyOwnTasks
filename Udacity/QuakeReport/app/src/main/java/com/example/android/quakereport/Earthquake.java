package com.example.android.quakereport;

public class Earthquake {

    private String mMagnitude;
    private String mLocation;
    private String mDate;


    public Earthquake(String mMagnitude, String mDate, String mLocation) {
        this.mMagnitude = mMagnitude;
        this.mDate = mDate;
        this.mLocation = mLocation;
    }

    public String getmDate() {
        return mDate;
    }

    public String getmLocation() {
        return mLocation;
    }

    public String getmMagnitude() {
        return mMagnitude;
    }
}
