package com.clouds.designPattern.observer.mvpEvent.observer;

import com.clouds.designPattern.observer.mvpEvent.listener.CustomEventLister;
import com.clouds.designPattern.observer.mvpEvent.msg.CustomMsg;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author clouds
 * @version 1.0
 */
@Slf4j
@Component
public class CustomEventOberver {
    @CustomEventLister
    public void handleEventMsg(String msg) {
        log.info("## CustomEventTest handleEventMsg method msg={} ##", msg);
    }

    @CustomEventLister
    public void handleEventCustomMsg(CustomMsg msg) {
        log.info("## CustomEventTest handleEventCustomMsg method msg={} ##", msg.toString());
    }
}
