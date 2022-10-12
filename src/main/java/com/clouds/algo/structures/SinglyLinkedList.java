package com.clouds.algo.structures;


import java.util.StringJoiner;

/**
 * @author clouds
 * @version 1.0
 */
public class SinglyLinkedList {
    private Node head;
    private int size;

    public SinglyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public SinglyLinkedList(Node node, int size) {
        this.head = node;
        this.size = size;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    /**
     * 判断单链表是否存在环
     *
     * @return true｜false
     */
    public boolean detectLoop() {
        Node currNodeSlow = head;
        Node currNodeFast = head;
        while (currNodeFast != null && currNodeFast.next != null) {
            currNodeSlow = currNodeSlow.next;
            currNodeFast = currNodeFast.next.next;
            if (currNodeSlow == currNodeFast) {
                return true;
            }
        }
        return false;
    }

    /**
     * 反转链表
     *
     * @return 头节点
     */
    public Node reverseList() {
        Node prev = null;
        Node curr = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    /**
     * 释放链表节点供GC回收
     */
    public void clear() {
        Node cur = head;
        while (cur != null) {
            Node prev = cur;
            cur = cur.next;
            prev = null;
        }
        head = null;
        size = 0;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getHead() {
        return head;
    }

    /**
     * 统计链表个数
     *
     * @return 链表count
     */
    public int count() {
        Node cur = head;
        int count = 0;
        while (cur != null) {
            cur = cur.next;
            count++;
        }
        return count;
    }

    /**
     * 查找某个key是否在链表中
     *
     * @param key 查找值
     * @return false | true
     */
    public boolean search(int key) {
        Node cur = head;
        while (cur != null) {
            if (cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    @Override
    public String toString() {
        StringJoiner stringJoiner = new StringJoiner("->");
        Node cur = head;
        while (cur != null) {
            stringJoiner.add(cur.val + "");
            cur = cur.next;
        }
        return stringJoiner.toString();
    }

    /**
     * 打印链表所有节点
     */
    public void print() {
        Node cur = head;
        while (cur != null && cur.next != null) {
            System.out.print(cur.val + "->");
            cur = cur.next;
        }
        if (cur != null) {
            System.out.print(cur.val);
            System.out.println();
        }
    }

    /**
     * 在头节点插入数据
     *
     * @param data 插入的数据
     */
    public void insertHead(int data) {
        insertNth(data, 0);
    }

    /**
     * 在链表的尾部插入数据
     *
     * @param data 插入的值
     */
    public void insert(int data) {
        insertNth(data, size);
    }

    /**
     * 在链表中的指定位置插入节点
     *
     * @param data     插入的节点值
     * @param position 位置从0开始
     */
    public void insertNth(int data, int position) {
        checkBounds(position, 0, size);
        Node node = new Node(data);
        if (head == null) {
            head = node;
            size++;
            return;
        }
        if (position == 0) {
            node.next = head;
            head = node;
            size++;
            return;
        }
        Node prev = head;
        for (int i = 0; i < position - 1; i++) {
            prev = prev.next;
        }
        node.next = prev.next;
        prev.next = node;
        size++;
    }

    /**
     * 删除链表头节点
     */
    public void deleteHead() {
        deleteNth(0);
    }

    /**
     * 删除链表尾节点
     */
    public void delete() {
        deleteNth(size - 1);
    }

    /**
     * 删除链表第n个位置节点
     *
     * @param position 位置
     */
    public void deleteNth(int position) {
        checkBounds(position, 0, size - 1);
        if (position == 0) {
            Node destroy = head;
            head = head.next;
            size--;
            destroy = null;
            return;
        }
        Node prev = head;
        for (int i = 0; i < position - 1; i++) {
            prev = prev.next;
        }
        Node destroy = prev.next;
        prev.next = prev.next.next;
        destroy = null;
        size--;
    }

    /**
     * 获取指定index的节点值
     *
     * @param index 索引值
     * @return 对应节点值
     */
    public int getNth(int index) {
        checkBounds(index, 0, size - 1);
        Node cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.val;
    }

    /**
     * 边界条件检查
     *
     * @param position 位置
     * @param low      最小位置
     * @param high     最大位置
     */
    public void checkBounds(int position, int low, int high) {
        if (position < low || position > high) {
            throw new IndexOutOfBoundsException(position + "");
        }
    }

    public void printLinkedList() {
        Node dummyNode = head;
        while (dummyNode != null) {
            System.out.print(dummyNode.val + " ");
            dummyNode = dummyNode.next;
        }
    }
}
