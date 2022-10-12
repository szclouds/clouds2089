package com.clouds.algo.palindrom;

import com.clouds.algo.structures.SinglyLinkedList;
import org.junit.jupiter.api.Test;

/**
 * @author clouds
 * @version 1.0
 */
class PalindromeLinkedListTest {

    @Test
    void isPalindrome() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(2);
        list.insert(1);
        assert list.size() == 4;
        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
        assert palindromeLinkedList.isPalindrome(list.getHead());
        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.insert(1);
        assert palindromeLinkedList.isPalindrome(list1.getHead());
        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.insert(2);
        list2.insert(3);
        assert !palindromeLinkedList.isPalindrome(list2.getHead());
        SinglyLinkedList list3 = new SinglyLinkedList();
        list3.insert(2);
        list3.insert(3);
        list3.insert(3);
        list3.insert(3);
        list3.insert(2);
        assert palindromeLinkedList.isPalindrome(list3.getHead());
        SinglyLinkedList list4 = new SinglyLinkedList();
        list4.insert(2);
        list4.insert(2);
        list4.insert(3);
        list4.insert(3);
        list4.insert(2);
        list4.insert(2);
        assert palindromeLinkedList.isPalindrome(list4.getHead());
    }

    @Test
    void isPalindrome2() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(2);
        list.insert(1);
        assert list.size() == 4;
        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
        assert palindromeLinkedList.isPalindrome2(list.getHead());
        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.insert(1);
        assert palindromeLinkedList.isPalindrome2(list1.getHead());
        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.insert(2);
        list2.insert(3);
        assert !palindromeLinkedList.isPalindrome2(list2.getHead());
        SinglyLinkedList list3 = new SinglyLinkedList();
        list3.insert(2);
        list3.insert(3);
        list3.insert(3);
        list3.insert(3);
        list3.insert(2);
        assert palindromeLinkedList.isPalindrome2(list3.getHead());
        SinglyLinkedList list4 = new SinglyLinkedList();
        list4.insert(2);
        list4.insert(2);
        list4.insert(3);
        list4.insert(3);
        list4.insert(2);
        list4.insert(2);
        assert palindromeLinkedList.isPalindrome2(list4.getHead());
    }
}