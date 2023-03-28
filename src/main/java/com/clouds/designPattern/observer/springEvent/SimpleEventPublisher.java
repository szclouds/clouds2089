package com.clouds.designPattern.observer.springEvent;

import javax.annotation.Resource;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * @author clouds
 * @version 1.0
 */
@Component
public class SimpleEventPublisher {

    @Resource
    private ApplicationEventPublisher applicationEventPublisher;

    public void publishMsgEvent(String msg) {
        applicationEventPublisher.publishEvent(msg);
    }

    public void publishCustomMsg(CustomMsg msg) {
        applicationEventPublisher.publishEvent(msg);
    }
}
