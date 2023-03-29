package com.clouds.designPattern.observer.mvpEvent.listener;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 事件监听注解，作用于方法上，用于标识指定方法可监听事件
 *
 * @author clouds
 * @version 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value = ElementType.METHOD)
public @interface CustomEventLister {
}
