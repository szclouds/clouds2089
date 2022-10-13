package com.clouds.algo.leetcode;

import com.clouds.algo.structures.Node;

/**
 * @author clouds
 * @version 1.0
 */
public class Solution0876 {

    /**
     * 链表的中间结点
     *
     * @param head 链表头节点
     * @return 链表中间节点
     * @link <a href="https://leetcode.cn/problems/middle-of-the-linked-list/description/">...</a>
     */
    public Node middleNode(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node curNodeSlow = head;
        Node curNodeFast = head;
        while (curNodeFast != null && curNodeFast.next != null) {
            curNodeSlow = curNodeSlow.next;
            curNodeFast = curNodeFast.next.next;
        }
        return curNodeSlow;
    }
}
