package com.clouds.designPattern.observer.mvpEvent.msg;

import lombok.Data;
import lombok.ToString;

/**
 * @author clouds
 * @version 1.0
 */
@Data
@ToString
public class CustomMsg {
    private String userId;
    private String name;
}
