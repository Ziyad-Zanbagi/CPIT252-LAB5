package edu.kau.fcit.cpit252;

import edu.kau.fcit.cpit252.geoLocation.GeoLocation;
import edu.kau.fcit.cpit252.weatherDB.WeatherDBI;

public class Adapter implements WeatherGeo {

    @Override
    public String getWeatherInfo(double latitude, double longitude) {
        return new WeatherDBI().getWeatherInfo(new GeoLocation()
        .search(latitude, longitude));
    }
    
}
