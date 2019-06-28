package com.example.namazersomayosura.Repository;

import android.content.Context;
import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.namazersomayosura.PojoClass.Prayer_Time_Daiy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Namazer_daily_time_Repository {

    //    String url = "http://api.aladhan.com/v1/timings/1554724800?latitude=23.810315&longitude=90.4125&method=1";
    String url_base = "http://api.aladhan.com/v1/timings/";

//        1554724800?latitude=23.810315&longitude=90.4125&method=1;

    Prayer_Time_Daiy[] prayer_time_daiys;
    MutableLiveData<Prayer_Time_Daiy> mutableLiveData;

    Context context;
    String date;
    String lat;
    String lon;

    public Namazer_daily_time_Repository(Context context, String date, String lat, String lon) {
        this.context = context;
        this.date = date;
        this.lat = lat;
        this.lon = lon;
    }

    public MutableLiveData<Prayer_Time_Daiy> get_prayer_Time() {
        if (mutableLiveData == null) {
            mutableLiveData = new MutableLiveData<>();
        }

//complete url
        String url_complete = url_base + date + "?latitude=" + lat + "&longitude=" + lon + "&method=1";

        RequestQueue queue = Volley.newRequestQueue(context);
        // Request a string response from the provided URL.
        Log.e("Tag", "get_prayer_Time: " + url_complete);
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url_complete,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Display the first 500 characters of the response string.
                        GsonBuilder gsonBuilder = new GsonBuilder();
                        Gson gson = gsonBuilder.create();
                        Prayer_Time_Daiy prayer_time_daiys = gson.fromJson(response, Prayer_Time_Daiy.class);
//                        prayer_time_daiys = gson.fromJson(response, Prayer_Time_Daiy[].class);
//                        users = gson.fromJson(response, Users[].class);
                        mutableLiveData.setValue(prayer_time_daiys);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

// Add the request to the RequestQueue.
        queue.add(stringRequest);
        //return the mutable live data
        return mutableLiveData;
    }
}
