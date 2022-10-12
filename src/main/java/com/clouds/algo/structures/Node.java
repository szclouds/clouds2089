package com.clouds.algo.structures;

/**
 * @author clouds
 * @version 1.0
 */
public class Node {
    public int val;
    public Node next;

    public Node(int val) {
        this(val, null);
    }

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}
