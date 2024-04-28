package com.WeatherAPI.Weatherforecast.Dao;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.WeatherAPI.Weatherforecast.Model.WeatherForecast;
import com.WeatherAPI.Weatherforecast.Service.WeatherService;

@Service
public class WeatherServiceDao implements WeatherService{

	//private static final String API_KEY = "3b8d99eadamsha26862d9711a591p1c9646jsn359854f3d767";
	//private static final String API_KEY = "3b8d99eadamsha26862d9711a591p1c9646jsn359854f3d767";
    //private static final String API_URL = "https://forecast9.p.rapidapi.com/rapidapi/forecast/India/summary/";
	private static final String API_URL = "https://rapidweather.p.rapidapi.com/data/2.5/weather";
	private static final String API_KEY = "42a71cec0amsh3e950d0c32accd6p1a687djsn60ce630aea4a";

    private final RestTemplate restTemplate;

    public WeatherServiceDao(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public WeatherForecast getWeatherForecast(String city) {
        String url = API_URL.replace("{city}", city).replace("{apiKey}", API_KEY);
        return restTemplate.getForObject(url, WeatherForecast.class);
    }
}
