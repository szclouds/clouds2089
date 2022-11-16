package com.clouds.effective.commonMethod;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * @author clouds
 * @version 1.0
 */
public class Stack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        if (size == 0)
            throw new EmptyStackException();
        Object result = elements[--size];
        elements[size] = null; // Eliminate obsolete reference
        return result;
    }

    // Ensure space for at least one more element.
    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }

    // Clone method for class with references to mutable state
    @Override
    public Stack clone() {
        try {
            Stack result = (Stack) super.clone();
            // 需要特殊处理 避免elements被其他人操作而修改其内容，导致不可预测的安全性问题
            // 数组的复制使用clone方法
            result.elements = elements.clone();
            return result;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
