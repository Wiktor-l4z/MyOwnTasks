package com.example.android.quakereport;

public class Earthquake {

    private String mMagnitude;
    private String mLocation;
    private String mDate;

    private long mTimeInMilliseconds;

    public Earthquake(String mMagnitude, long mTimeInMilliseconds, String mLocation, String dataToDisplay) {
        this.mMagnitude = mMagnitude;
        this.mTimeInMilliseconds = mTimeInMilliseconds;
        this.mLocation = mLocation;
        this.mDate = dataToDisplay;
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

    public String getmMagnitude() {
        return mMagnitude;
    }
}
