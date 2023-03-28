package com.clouds.designPattern.observer.simple;

/**
 * 观察者接口
 *
 * @author clouds
 * @version 1.0
 */
public interface Observer {
    /**
     * 观察者发送消息接口
     *
     * @param message 消息字符串
     */
    void sendMsg(String message);
}
