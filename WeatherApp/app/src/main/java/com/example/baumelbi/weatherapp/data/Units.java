package com.example.baumelbi.weatherapp.data;

import org.json.JSONObject;

/**
 * Created by Bradley Baumel on 5/18/16.
 */
public class Units implements JSONPopulation{

    private String temperature;

    public String getTemperature() {
        return temperature;
    }

    @Override
    public void populate(JSONObject data) {

        temperature = data.optString("temperature");

    }
}
