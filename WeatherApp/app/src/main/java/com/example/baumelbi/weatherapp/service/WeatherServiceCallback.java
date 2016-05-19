package com.example.baumelbi.weatherapp.service;

import com.example.baumelbi.weatherapp.data.Channel;

/**
 * Created by Bradley Baumel on 5/18/16.
 */
public interface WeatherServiceCallback {
    void serviceSuccess(Channel channel);

    void serviceFailure(Exception exception);

}
