package com.clouds.algo.leetcode;

import com.clouds.algo.structures.SinglyLinkedList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * @author clouds
 * @version 1.0
 */
class Solution0876Test {

    @Test
    void middleNode() {
        Solution0876 solution0876 = new Solution0876();

        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(1);
        assert solution0876.middleNode(list.getHead()).val == 3;

        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.insert(1);
        assert solution0876.middleNode(list1.getHead()).val == 1;

        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.insert(1);
        list2.insert(2);
        list2.insert(22);
        list2.insert(1);
        list2.insert(1);
        assert solution0876.middleNode(list2.getHead()).val == 22;

    }
}