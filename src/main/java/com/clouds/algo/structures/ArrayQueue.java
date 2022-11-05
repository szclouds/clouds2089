package com.clouds.algo.structures;

/**
 * @author clouds
 * @version 1.0
 */
public class ArrayQueue {
    private final String[] items;
    private int head = 0;
    private int tail = 0;
    private int count = 0;

    public ArrayQueue(int capacity) {
        this.items = new String[capacity];
        this.count = capacity;
    }

    public boolean enQueue(String value) {
        if (tail == count) {
            return false;
        }
        items[tail] = value;
        tail++;
        return true;
    }

    public String deQueue() {
        if (tail == head) {
            return null;
        }
        return items[head++];
    }
}
