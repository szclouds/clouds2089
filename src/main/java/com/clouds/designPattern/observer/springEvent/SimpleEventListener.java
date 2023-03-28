package com.clouds.designPattern.observer.springEvent;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author clouds
 * @version 1.0
 */
@Component
@Slf4j
public class SimpleEventListener {

    @EventListener
    public void sendEventMsg(String msg) {
        log.info("## sendEventMsg={} ##", msg);
    }

    @EventListener
    public void sendEventMsg2(String msg) {
        log.info("## sendEventMsg2={} ##", msg);
    }

    @EventListener
    @Async
    public void sendCustomMsg(CustomMsg msg) {
        log.info("## sendCustomMsg={} ##", msg.toString());
    }
}
