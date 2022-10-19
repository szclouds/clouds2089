package com.clouds.algo.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author clouds
 * @version 1.0
 */
public class Solution0225 {
    private Deque<Integer> deque1;
    private Deque<Integer> deque2;

    /**
     * 用队列实现栈
     * 反复利用其中一个队列，使其成为临时队列，将新元素放入空队列中，再将非空队列中的元素一一从头部弹出，加入空队列的尾部中
     * Deque api：
     * isEmpty()-返回队列是否为空
     * offer(x)-将x加入队列尾部
     * poll()-将队列头部的元素弹出
     * peek()-获取队列头部的元素
     *
     * @link <a href="https://leetcode.cn/problems/implement-stack-using-queues/description/">...</a>
     */
    public Solution0225() {
        deque1 = new ArrayDeque<>();
        deque2 = new ArrayDeque<>();
    }

    public void push(int x) {
        if (deque1.isEmpty()) {
            deque1.offer(x);
            while (!deque2.isEmpty()) {
                deque1.offer(deque2.poll());
            }
        } else {
            deque2.offer(x);
            while (!deque1.isEmpty()) {
                deque2.offer(deque1.poll());
            }
        }
    }

    public int pop() {
        if (!deque1.isEmpty()) {
            return deque1.poll();
        } else {
            return deque2.poll();
        }
    }

    public int top() {
        if (!deque1.isEmpty()) {
            return deque1.peek();
        } else {
            return deque2.peek();
        }
    }

    public boolean empty() {
        return deque1.isEmpty() && deque2.isEmpty();
    }
}
