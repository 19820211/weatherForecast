package com.example.weatherForecast.service;

import com.example.weatherForecast.model.WeatherModel;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Primary
//@Service
public class GoogleApiService implements WeatherService{
    @Override
    public WeatherModel getWeather(String city) {
        return null;
    }
}
