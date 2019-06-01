package com.example.weatherForecast.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data //omijamy gettery i settery
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherModel {

    @JsonProperty("base")
    private String base;

    @JsonProperty("main")
    private TemperatureModel temperatureModel = new TemperatureModel();


}
