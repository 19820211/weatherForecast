package com.example.weatherForecast.service;

import com.example.weatherForecast.model.WeatherModel;

public interface WeatherService {
    WeatherModel getWeather(String city);

}
