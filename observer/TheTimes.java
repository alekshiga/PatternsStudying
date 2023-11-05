package observer;

import java.util.ArrayList;
import java.util.List;

public class TheTimes implements Subject {

    private List<Observer> observers;

    public TheTimes() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers(String news) {
        for (final Observer observer : observers) {
            observer.update(news);
        }
    }
}
