package com.clouds.designPattern.observer.mvpEvent.eventBus;

import com.clouds.designPattern.observer.mvpEvent.ObserverRegistry;
import com.clouds.designPattern.observer.mvpEvent.action.CustomEventAction;
import com.clouds.designPattern.observer.mvpEvent.observer.CustomEventOberver;
import java.util.List;
import java.util.concurrent.Executor;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;

/**
 * @author clouds
 * @version 1.0
 */
@Component
public class CustomEventBus {
    private Executor executor;
    @Resource
    private ObserverRegistry observerRegistry;

    @Resource
    private CustomEventOberver customEventOberver;

    @PostConstruct
    private void init() {
        observerRegistry.register(customEventOberver);
    }

    public CustomEventBus() {
    }

    protected CustomEventBus(Executor executor) {
        this.executor = executor;
    }

    protected void setExecutor(Executor executor) {
        this.executor = executor;
    }

    public void register(Object object) {
        observerRegistry.register(object);
    }

    public void post(Object event) {
        List<CustomEventAction> actions = observerRegistry.getMatchedActions(event);
        for (CustomEventAction action : actions) {
            if (executor != null) {
                executor.execute(() -> action.execute(event));
            } else {
                action.execute(event);
            }
        }
    }
}
