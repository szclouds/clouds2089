package com.clouds.designPattern.observer.mvpEvent.eventBus;

import java.util.concurrent.Executor;
import org.springframework.stereotype.Component;

/**
 * @author clouds
 * @version 1.0
 */
@Component
public class CustomAsyncEventBus extends CustomEventBus {
    public CustomAsyncEventBus(Executor executor) {
        super(executor);
    }

    public CustomAsyncEventBus() {
    }

    @Override
    public void setExecutor(Executor executor) {
        super.setExecutor(executor);
    }
}
