package com.designpatterns.observer;

public class TvDisplay implements Observer {
    private String weather;

    @Override
    public void updateWeather(String weather ) {
        this.weather = weather;
        displayWeather();
    }
    public void displayWeather() {
        System.out.println(this.weather);
    }
}
