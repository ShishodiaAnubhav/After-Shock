package com.example.android.aftershock;

public class EarthQuake {

    private double mMagnitude;

    private String mLocation;

    private long mTimeInMilliseconds;

    private String mUrl;

    public EarthQuake(double magnitude, String location, long TimeInMilliseconds, String url){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = TimeInMilliseconds;
        mUrl = url;
    }

    public double getMagnitude(){
        return mMagnitude;
    }

    public  String getLocation(){
        return mLocation;
    }

    public long getMTimeInMilliseconds(){
        return mTimeInMilliseconds;
    }

    public String getUrl(){
        return mUrl;
    }

}
