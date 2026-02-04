package com.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    private List<Observer> observers= new ArrayList<>();;
    private String weather;
    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }
    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }
    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.updateWeather(this.weather);
        }

    }
    public void setWeather(String weather) {
        this.weather = weather;
        notifyObservers();
    }


}
