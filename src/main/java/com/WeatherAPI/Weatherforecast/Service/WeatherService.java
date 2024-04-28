package com.WeatherAPI.Weatherforecast.Service;

import com.WeatherAPI.Weatherforecast.Model.WeatherForecast;

public interface WeatherService {
	WeatherForecast getWeatherForecast(String city);
}
