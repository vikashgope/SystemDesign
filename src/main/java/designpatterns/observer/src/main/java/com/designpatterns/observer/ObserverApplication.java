package com.designpatterns.observer;


public class ObserverApplication {

    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();
        PhoneDisplay phoneDisplay = new PhoneDisplay();
        TvDisplay tvDisplay = new TvDisplay();
        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(tvDisplay);
        weatherStation.setWeather("Rainy");
        weatherStation.setWeather("Sunny");
        weatherStation.removeObserver(tvDisplay);
        weatherStation.setWeather("Cloudy");
    }
}
