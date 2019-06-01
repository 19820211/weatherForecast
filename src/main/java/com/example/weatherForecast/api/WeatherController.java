package com.example.weatherForecast.api;

import com.example.weatherForecast.model.WeatherModel;
import com.example.weatherForecast.service.OpenWeatherMapService;
import com.example.weatherForecast.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/weather")
    public String getWeather(@RequestParam String city, ModelMap map) {
        map.put("weather", weatherService.getWeather(city));
        return "result";
    }


}
