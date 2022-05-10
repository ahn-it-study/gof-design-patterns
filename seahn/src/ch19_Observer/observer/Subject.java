package ch19_Observer.observer;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();

    interface Observer {
        void update(float temp, float humidity, float pressure);
    }

    interface DisplayElement {
        void display();
    }
}
