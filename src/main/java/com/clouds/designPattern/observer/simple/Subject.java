package com.clouds.designPattern.observer.simple;


/**
 * 被观察者接口
 *
 * @author clouds
 * @version 1.0
 */
public interface Subject {
    /**
     * 注册观察者
     *
     * @param observer 观察者对象
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     *
     * @param observer 观察者对象
     */
    void removeObserver(Observer observer);

    /**
     * 通知所有观察者
     *
     * @param message 消息字符串
     */
    void notifyObservers(String message);
}
