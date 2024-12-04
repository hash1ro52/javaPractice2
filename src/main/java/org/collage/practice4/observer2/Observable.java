package org.collage.practice4.observer2;


import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    private List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(BankNotification notification) {
        for (Observer observer : observers) {
            observer.notify(notification);
        }
    }
}

