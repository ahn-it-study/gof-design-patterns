package ch19_Observer.observer;

import ch19_Observer.observer.Subject;

public class CurrentConditionDisplay implements Subject.Observer, Subject.DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public String toString() {
        return "CurrentConditionDisplay{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", weatherData=" + weatherData +
                '}';
    }
}
