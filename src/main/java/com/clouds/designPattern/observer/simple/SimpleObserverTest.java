package com.clouds.designPattern.observer.simple;

/**
 * @author clouds
 * @version 1.0
 */
public class SimpleObserverTest {
    public static void main(String[] args) {
        SimpleSubject simpleSubject = new SimpleSubject();
        simpleSubject.registerObserver(new ObserverOne());
        simpleSubject.registerObserver(new ObserverTwo());
        simpleSubject.notifyObservers("SimpleObserverTest msg");
    }
}
