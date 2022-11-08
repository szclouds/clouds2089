package com.clouds.algo.structures;

/**
 * 环形队列、实现无需数据搬移的队列，循环使用数组空间，数组tail处始终为空，循环队列将空出一个数组元素
 *
 * @author clouds
 * @version 1.0
 */
public class CircularQueue {
    private final int n;
    private final String[] items;
    private int tail=0;
    private int head=0;

    public CircularQueue(int capacity) {
        this.items = new String[capacity];
        this.n = capacity;
    }

    public boolean enqueue(String value) {
        if ((tail + 1) % n == head) {
            return false;
        }
        items[tail] = value;
        tail = (tail + 1) % n;
        return true;
    }

    public String dequeue() {
        if (tail == head) {
            return null;
        }
        String ret = items[head];
        head = (head + 1) % n;
        return ret;
    }
}
