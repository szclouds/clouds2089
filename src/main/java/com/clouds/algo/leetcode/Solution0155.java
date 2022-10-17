package com.clouds.algo.leetcode;

/**
 * @author clouds
 * @version 1.0
 */
public class Solution0155 {
    /**
     * 数据栈
     */
    private int[] stack;
    /**
     * 数据栈对应的最小值栈
     */
    private int[] minStack;
    /**
     * 数据栈count
     */
    private int count;
    /**
     * 最小值栈count
     */
    private int minCount;

    /**
     * 最小栈
     * 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
     * 维护两个栈，一个记录已有入栈数据，另外一个在栈顶记录整个数据的最小值
     *
     * @link <a href="https://leetcode.cn/problems/min-stack/description/">...</a>
     */
    public Solution0155() {
        this.stack = new int[10];
        this.count = 0;
        this.minStack = new int[10];
        this.minCount = 0;
    }

    /**
     * 入栈操作，支持动态扩容
     *
     * @param val 入栈值
     */
    public void push(int val) {
        if (count >= stack.length) {
            resize();
        }
        stack[count] = val;
        count++;
        if (count == 1) {
            minStack[minCount] = val;
        } else {
            minStack[minCount] = Math.min(minStack[Math.max(minCount - 1, 0)], val);
        }
        minCount++;
    }

    private void resize() {
        int[] newStack = new int[stack.length * 2];
        for (int i = 0; i < this.stack.length; i++) {
            newStack[i] = stack[i];
        }
        this.stack = newStack;
        int[] newMinStack = new int[minStack.length * 2];
        for (int i = 0; i < this.minStack.length; i++) {
            newMinStack[i] = minStack[i];
        }
        this.minStack = newMinStack;
    }

    /**
     * 出栈操作
     */
    public void pop() {
        stack[count - 1] = 0;
        count--;
        minStack[minCount - 1] = 0;
        minCount--;
    }

    /**
     * 获取栈顶元素
     *
     * @return 栈顶元素
     */
    public int top() {
        return stack[count - 1];
    }

    /**
     * 获取最小值
     *
     * @return minVal
     */
    public int getMin() {
        return minStack[minCount - 1];
    }
}
