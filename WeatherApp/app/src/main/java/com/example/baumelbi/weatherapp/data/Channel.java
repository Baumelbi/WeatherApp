package com.example.baumelbi.weatherapp.data;

import org.json.JSONObject;

/**
 * Created by Bradley Baumel on 5/18/16.
 */
public class Channel implements JSONPopulation{
    private Units units;
    private Item item;

    public Units getUnits() {
        return units;
    }

    public Item getItem() {
        return item;
    }

    @Override
    public void populate(JSONObject data) {

        units = new Units();
        units.populate(data.optJSONObject("units"));

        item = new Item();
        item.populate(data.optJSONObject("item"));
    }
}
