package com.designer.test.observer;
import org.junit.Test;

public class TestObserver {
    @Test
    public void test(){
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(90,73,29.4f);
        weatherData.setMeasurements(78,68,31.4f);
    }
}
