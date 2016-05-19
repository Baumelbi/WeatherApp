package com.example.baumelbi.weatherapp.data;

import org.json.JSONObject;

/**
 * Created by Bradley Baumel on 5/18/16.
 */
public class Condition implements JSONPopulation{

    private int code;
    private int temperature;
    private String description;

    public int getCode() {
        return code;
    }

    public int getTemperature() {
        return temperature;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public void populate(JSONObject data) {
        code = data.optInt("code");
        temperature = data.optInt("temp");
        description = data.optString("text");

    }
}
