package com.clouds.algo.leetcode;

import org.junit.jupiter.api.Test;

/**
 * @author clouds
 * @version 1.0
 */
class Solution0155Test {


    @Test
    void test() {
        Solution0155 minStack = new Solution0155();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        assert minStack.getMin() == -3;
        minStack.pop();
        assert minStack.top() == 0;
        assert minStack.getMin() == -2;
    }

    @Test
    void push() {
    }

    @Test
    void pop() {
    }

    @Test
    void top() {
    }

    @Test
    void getMin() {
    }
}