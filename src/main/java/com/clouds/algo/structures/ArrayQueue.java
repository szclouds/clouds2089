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

    /**
     * 支持数据迁移的入队操作
     * 当tail到数组最大值时，且head不等于0时进行数据迁移，同时更新tail和head
     *
     * @param value 入队值
     * @return 入队结果 true-成功，false-失败
     */
    public boolean enQueue(String value) {
        if (tail == count) {
            if (head == 0) {
                return false;
            }
            for (int i = head; i < tail; i++) {
                items[i - head] = items[i];
            }
            head = 0;
            tail = tail - head;
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
