package com.example.weatherForecast.api;

import com.example.weatherForecast.model.WeatherModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class WeatherController {

    //weather?city=Warsaw
    @ResponseBody
    @GetMapping("/weather")
    public String getWeather(@RequestParam String city){
        String apiUrl = "http://api.openweathermap.org/data/2.5/weather?q="+
                city+",pl&appid=ef2028e98b54649bf1f4c4582631f350";
        WeatherModel weatherModel = new RestTemplate().getForObject(apiUrl, WeatherModel.class);
        return weatherModel.toString();
    }




}
