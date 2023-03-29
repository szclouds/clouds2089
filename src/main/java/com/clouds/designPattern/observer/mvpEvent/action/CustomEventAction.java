package com.clouds.designPattern.observer.mvpEvent.action;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

/**
 * @author clouds
 * @version 1.0
 */
public class CustomEventAction {
    /**
     * 监听方法
     */
    private final Method method;
    /**
     * 监听对象
     */
    private final Object target;

    public CustomEventAction(Object target, Method method) {
        if (target == null || method == null) {
            throw new RuntimeException("CustomEventAction() target or method param is null.");
        }
        this.target = target;
        this.method = method;
        this.method.setAccessible(true);
    }

    /**
     * 执行监听方法
     *
     * @param event 方法入参
     */
    public void execute(Object event) {
        try {
            this.method.invoke(target, event);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomEventAction)) return false;
        CustomEventAction that = (CustomEventAction) o;
        return Objects.equals(method, that.method) && Objects.equals(target, that.target);
    }

    @Override
    public int hashCode() {
        return Objects.hash(method, target);
    }
}
