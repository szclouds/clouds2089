package com.clouds.designPattern.observer.simple;

import lombok.extern.slf4j.Slf4j;

/**
 * @author clouds
 * @version 1.0
 */
@Slf4j
public class ObserverOne implements Observer {
    @Override
    public void sendMsg(String message) {
        log.info("ObserverOne msg={}", message);
    }
}
