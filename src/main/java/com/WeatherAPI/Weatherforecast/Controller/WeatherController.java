package com.WeatherAPI.Weatherforecast.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.WeatherAPI.Weatherforecast.Model.WeatherForecast;
import com.WeatherAPI.Weatherforecast.Service.WeatherService;

@Controller

public class WeatherController {
	private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/weather")
    public WeatherForecast getWeatherForecast(@RequestParam("city") String city) {
    	System.out.println("hello");
    	System.out.println("Hi"+weatherService.getWeatherForecast(city));
    	       return weatherService.getWeatherForecast(city);
        
    }
    
    @GetMapping("/")
    public String Homepage()
    {
    	return "WeatherForecast";
    }
    
    
}
