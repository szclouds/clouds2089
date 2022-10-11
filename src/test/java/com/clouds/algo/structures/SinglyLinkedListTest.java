package com.clouds.algo.structures;

import org.junit.jupiter.api.Test;

/**
 * @author clouds
 * @version 1.0
 */
class SinglyLinkedListTest {

    @Test
    void test() {
        SinglyLinkedList list = new SinglyLinkedList();
        assert list.isEmpty();
        assert list.size() == 0 && list.count() == 0;
        assert list.toString().equals("");

        /* Test insert function */
        list.insertHead(5);
        list.insertHead(7);
        list.insertHead(10);
        list.insert(3);
        list.insertNth(1, 4);
        assert list.toString().equals("10->7->5->3->1");
        System.out.println(list.toString());
        /* Test search function */
        assert list.search(10) &&
                list.search(5) &&
                list.search(1) &&
                !list.search(100);

        /* Test get function */
        assert list.getNth(0) == 10 &&
                list.getNth(2) == 5 &&
                list.getNth(4) == 1;

        /* Test delete function */
        list.deleteHead();
        list.deleteNth(1);
        list.delete();
        assert list.toString().equals("7->3");
        System.out.println(list.toString());
        assert list.size() == 2 && list.size() == list.count();

        list.clear();
        assert list.isEmpty();

        try {
            list.delete();
            assert false;
            /* this should not happen */
        } catch (Exception e) {
            assert true;
            /* this should happen */
        }

        SinglyLinkedList instance = new SinglyLinkedList();
        Node head = new Node(
                0,
                new Node(2, new Node(3, new Node(3, new Node(4))))
        );
        instance.setHead(head);
        instance.print();
    }

    @Test
    void detectLoop() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertHead(5);
        list.insertHead(7);
        list.insertHead(10);
        list.insert(3);
        list.insertNth(1, 4);
        assert !list.detectLoop();
    }

    @Test
    void size() {
        SinglyLinkedList list = new SinglyLinkedList();
        assert list.size() == 0;
        list.insertHead(5);
        list.insertHead(7);
        list.insertHead(10);
        list.insert(3);
        list.insertNth(1, 4);
        assert list.size() == 5;
    }

    @Test
    void isEmpty() {
        SinglyLinkedList list = new SinglyLinkedList();
        assert list.isEmpty();
    }


    @Test
    void reverseList() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertHead(5);
        list.insertHead(7);
        list.insertHead(10);
        list.insert(3);
        Node node = list.reverseList();
        SinglyLinkedList reverseList = new SinglyLinkedList(node, 4);
        assert reverseList.toString().equals("3->5->7->10");
    }

    @Test
    void clear() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertHead(5);
        list.insertHead(7);
        list.insertHead(10);
        list.insert(3);
        list.clear();
        assert list.isEmpty();
    }

    @Test
    void count() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertHead(5);
        list.insertHead(7);
        list.insertHead(10);
        list.insert(3);
        assert list.count() == 4;
    }

    @Test
    void search() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertHead(5);
        list.insertHead(7);
        list.insertHead(10);
        list.insert(3);
        assert list.search(5);
        assert !list.search(999);
    }
}