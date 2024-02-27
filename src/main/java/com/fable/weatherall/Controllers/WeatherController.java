package com.fable.weatherall.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fable.weatherall.Services.WeatherService;

@RestController
public class WeatherController {
	@Autowired
    private WeatherService weatherService;

    @GetMapping("/weather/forecast")
    public String getWeatherForecast(@RequestParam String city) {
        return weatherService.get5DayForecast(city);
    }
}
