package ch19_Observer.observer;

public class StatisticsDisplay implements Subject.Observer, Subject.DisplayElement{
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
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
        System.out.println("Statistic conditions: " + temperature + "F Max degrees and " + humidity + "% Max humidity");
    }

    @Override
    public String toString() {
        return "StatisticsDisplay{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", weatherData=" + weatherData +
                '}';
    }
}
