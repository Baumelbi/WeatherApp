package com.example.baumelbi.weatherapp.data;

import org.json.JSONObject;

/**
 * Created by baumelbi on 5/18/16.
 */
public class Item implements JSONPopulation {

    private Condition condition;

    public Condition getCondition() {
        return condition;
    }

    @Override
    public void populate(JSONObject data) {
        condition = new Condition();
        condition.populate(data.optJSONObject("condition"));

    }
}
