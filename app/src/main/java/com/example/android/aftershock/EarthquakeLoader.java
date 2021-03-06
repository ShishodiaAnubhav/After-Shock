package com.example.android.aftershock;

import android.content.AsyncTaskLoader;
import android.content.Context;



import java.util.List;

public class EarthquakeLoader extends AsyncTaskLoader<List<EarthQuake>> {

    private String mUrl;

    public EarthquakeLoader(Context context, String url){
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading(){
        forceLoad();
    }

    public List<EarthQuake> loadInBackground(){
        if(mUrl == null){
            return null;
        }

        List<EarthQuake> earthquakes = QueryUtils.fetchEarthquakeData(mUrl);
        return earthquakes;
    }
}

