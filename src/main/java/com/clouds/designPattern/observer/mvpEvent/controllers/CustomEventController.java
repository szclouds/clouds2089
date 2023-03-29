package com.clouds.designPattern.observer.mvpEvent.controllers;

import com.clouds.designPattern.observer.mvpEvent.eventBus.CustomAsyncEventBus;
import com.clouds.designPattern.observer.mvpEvent.eventBus.CustomEventBus;
import com.clouds.designPattern.observer.mvpEvent.msg.CustomMsg;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author clouds
 * @version 1.0
 */
@RestController
@RequestMapping("/custom_event")
public class CustomEventController {

    @Resource
    private CustomEventBus customEventBus;

    @Resource
    private ThreadPoolTaskExecutor threadPoolTaskExecutor;

    @Resource
    private CustomAsyncEventBus customAsyncEventBus;

    @PostConstruct
    private void init() {
        customAsyncEventBus.setExecutor(threadPoolTaskExecutor);
    }

    @GetMapping
    public String customEventHandler() {
        customEventBus.post("custom_event string msg");
        CustomMsg customMsg = new CustomMsg();
        customMsg.setName("testName");
        customMsg.setUserId("testUserId");
        customEventBus.post(customMsg);

        customAsyncEventBus.post("custom_event string async msg");
        customMsg.setName("testAsyncName");
        customAsyncEventBus.post(customMsg);
        return "custom_event success";
    }
}
