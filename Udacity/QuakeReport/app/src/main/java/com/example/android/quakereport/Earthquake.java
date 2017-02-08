package com.example.android.quakereport;

public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private String mDate;
    private String mUrl;

    private long mTimeInMilliseconds;

    public Earthquake(double mMagnitude, long mTimeInMilliseconds, String mLocation, String dataToDisplay, String mUrl) {
        this.mMagnitude = mMagnitude;
        this.mTimeInMilliseconds = mTimeInMilliseconds;
        this.mLocation = mLocation;
        this.mDate = dataToDisplay;
        this.mUrl = mUrl;
    }

    public long getmTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getmDate() {
        return mDate;
    }

    public String getmLocation() {
        return mLocation;
    }

    public double getmMagnitude() {
        return mMagnitude;
    }

    public String getmUrl() {
        return mUrl;
    }
}
