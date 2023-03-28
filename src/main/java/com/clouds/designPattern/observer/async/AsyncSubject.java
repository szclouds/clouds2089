package com.clouds.designPattern.observer.async;

import com.clouds.designPattern.observer.simple.Observer;
import com.clouds.designPattern.observer.simple.Subject;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import lombok.extern.slf4j.Slf4j;

/**
 * @author clouds
 * @version 1.0
 */
@Slf4j
public class AsyncSubject implements Subject {
    private final Set<Observer> observers = ConcurrentHashMap.newKeySet();
    private final Executor executor = new ThreadPoolExecutor(
            3,
            5,
            5,
            TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(5));

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
        if (observers.size() < 1) {
            log.warn("observers size < 1");
        }
        for (Observer observer : observers) {
            executor.execute(() -> observer.sendMsg(message));
        }
    }
}
