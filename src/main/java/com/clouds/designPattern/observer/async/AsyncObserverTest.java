package com.clouds.designPattern.observer.async;

import com.clouds.designPattern.observer.simple.ObserverOne;
import com.clouds.designPattern.observer.simple.ObserverTwo;

/**
 * @author clouds
 * @version 1.0
 */
public class AsyncObserverTest {
    public static void main(String[] args) {
        AsyncSubject asyncSubject = new AsyncSubject();
        asyncSubject.registerObserver(new ObserverOne());
        asyncSubject.registerObserver(new ObserverTwo());
        asyncSubject.notifyObservers("AsyncObserverTest msg");
    }
}
