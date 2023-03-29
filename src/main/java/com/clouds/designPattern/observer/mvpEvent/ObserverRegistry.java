package com.clouds.designPattern.observer.mvpEvent;

import com.clouds.designPattern.observer.mvpEvent.action.CustomEventAction;
import com.clouds.designPattern.observer.mvpEvent.listener.CustomEventLister;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.springframework.stereotype.Component;

/**
 * 核心类，用于管理观察者
 *
 * @author clouds
 * @version 1.0
 */
@Component
public class ObserverRegistry {
    // key-消息类型，value-执行方法集合
    private final ConcurrentHashMap<Class<?>, CopyOnWriteArraySet<CustomEventAction>> registry = new ConcurrentHashMap<>();

    /**
     * 注册观察者对象
     *
     * @param observer 观察者对象
     */
    public void register(Object observer) {
        // 查询所有观察者监听方法
        Map<Class<?>, List<CustomEventAction>> customEventActions = findAllObserverActions(observer);
        // 遍历监听方法并进行注册
        for (Map.Entry<Class<?>, List<CustomEventAction>> map : customEventActions.entrySet()) {
            Class<?> type = map.getKey();
            List<CustomEventAction> actions = map.getValue();
            CopyOnWriteArraySet<CustomEventAction> sets = registry.get(type);
            if (sets == null) {
                registry.put(type, new CopyOnWriteArraySet<>());
                sets = registry.get(type);
            }
            sets.addAll(actions);
        }
    }

    /**
     * 获取所有匹配 event 事件类型的action集合
     *
     * @param event 事件对象
     * @return action结合
     */
    public List<CustomEventAction> getMatchedActions(Object event) {
        List<CustomEventAction> matchedObservers = new ArrayList<>();
        Class<?> postedEventType = event.getClass();
        for (Map.Entry<Class<?>, CopyOnWriteArraySet<CustomEventAction>> entry : registry.entrySet()) {
            Class<?> type = entry.getKey();
            CopyOnWriteArraySet<CustomEventAction> actions = entry.getValue();
            // 兼容多态情况判断
            if (postedEventType.isAssignableFrom(type)) {
                matchedObservers.addAll(actions);
            }
        }
        return matchedObservers;
    }

    public int getRegistrySize(){
        return registry.size();
    }

    /**
     * 获取所有观察者对象中的监听方法
     *
     * @param observer 观察者对象
     * @return 监听方法集合
     */
    public Map<Class<?>, List<CustomEventAction>> findAllObserverActions(Object observer) {
        // key-参数类型，value-监听方法集合
        Map<Class<?>, List<CustomEventAction>> ret = new HashMap<>();
        Class<?> clazz = observer.getClass();
        // 获取所有带 @CustomEventLister 注解的方法
        List<Method> methods = getAnnotatedMethods(clazz);
        for (Method method : methods) {
            // 获取方法参数 只支持单个参数
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?> type = parameterTypes[0];
            List<CustomEventAction> customEventActions = ret.get(type);
            if (customEventActions == null) {
                ret.put(type, new ArrayList<>());
                customEventActions = ret.get(type);
            }
            customEventActions.add(new CustomEventAction(observer, method));
        }
        return ret;
    }

    /**
     * 获取所有带 @CustomEventLister 注解的方法
     *
     * @param clazz 类
     * @return 方法集合
     */
    private List<Method> getAnnotatedMethods(Class<?> clazz) {
        List<Method> ret = new ArrayList<>();
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(CustomEventLister.class)) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length != 1) {
                    throw new RuntimeException("Method must one parameter");
                }
                ret.add(method);
            }
        }
        return ret;
    }
}
