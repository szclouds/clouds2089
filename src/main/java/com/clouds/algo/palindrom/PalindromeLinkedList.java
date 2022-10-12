package com.clouds.algo.palindrom;

import com.clouds.algo.structures.Node;

public class PalindromeLinkedList {
    /**
     * @param head 单链表头节点
     * @return true | false
     */
    public boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }
        Node curNodeSlow = head;
        Node curNodeFast = head;
        Node prev = null;
        Node next;
        while (curNodeFast != null && curNodeFast.next != null) {
            curNodeFast = curNodeFast.next.next;
            next = curNodeSlow.next;
            curNodeSlow.next = prev;
            prev = curNodeSlow;
            curNodeSlow = next;
        }
        if (curNodeFast != null) {
            prev = new Node(curNodeSlow.val, prev);
        }
        while (curNodeSlow != null && prev != null) {
            if (curNodeSlow.val != prev.val) {
                return false;
            }
            curNodeSlow = curNodeSlow.next;
            prev = prev.next;
        }
        return curNodeSlow == null && prev == null;
    }

    Node left;

    /**
     * 递归实现，类比二叉树前中后序遍历
     *
     * @param head 链表头节点
     * @return true｜false
     */
    public boolean isPalindrome2(Node head) {
        left = head;
        return dfs(head);
    }

    private boolean dfs(Node right) {
        if (right == null) {
            return true;
        }
        boolean res = dfs(right.next);
        res = res && (left.val == right.val);
        left = left.next;
        return res;
    }
}
