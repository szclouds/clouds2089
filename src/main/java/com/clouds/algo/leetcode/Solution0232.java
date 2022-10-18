package com.clouds.algo.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author clouds
 * @version 1.0
 */
public class Solution0232 {
    private Deque<Integer> inStack;
    private Deque<Integer> outStack;

    public Solution0232() {
        inStack = new ArrayDeque<>();
        outStack = new ArrayDeque<>();
    }

    public void push(int x) {
        inStack.push(x);
    }

    public int pop() {
        if (outStack.isEmpty()) {
            int2out();
        }
        return outStack.pop();
    }

    public int peek() {
        if (outStack.isEmpty()) {
            int2out();
        }
        return outStack.peek();
    }

    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }

    private void int2out() {
        while (!inStack.isEmpty()) {
            outStack.push(inStack.pop());
        }
    }
}
