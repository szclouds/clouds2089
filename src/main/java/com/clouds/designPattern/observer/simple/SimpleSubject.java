package com.clouds.designPattern.observer.simple;


import java.util.HashSet;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;

/**
 * 被观察者
 *
 * @author clouds
 * @version 1.0
 */
@Slf4j
public class SimpleSubject implements Subject {
    private final Set<Observer> observers = new HashSet<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        if (observers.size() < 0) {
            log.warn("observers size < 0");
        }
        for (Observer observer : observers) {
            observer.sendMsg(message);
        }
    }
}
