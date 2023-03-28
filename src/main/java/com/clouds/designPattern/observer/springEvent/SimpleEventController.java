package com.clouds.designPattern.observer.springEvent;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author clouds
 * @version 1.0
 */
@RestController
@RequestMapping("/simple_event")
public class SimpleEventController {
    @Resource
    private SimpleEventPublisher simplePublisher;

    @GetMapping
    public String simpleEventHandler() {
        simplePublisher.publishMsgEvent("string msg");
        CustomMsgChild customMsg = new CustomMsgChild("name", 100);
        simplePublisher.publishCustomMsg(customMsg);
        return "simpleEventHandler test success";
    }
}
