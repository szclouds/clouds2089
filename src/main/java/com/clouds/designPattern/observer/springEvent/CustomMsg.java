package com.clouds.designPattern.observer.springEvent;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 * @author clouds
 * @version 1.0
 */
@Data
@Builder
@ToString
public class CustomMsg {
    private String fieldName;
    private int total;
}
