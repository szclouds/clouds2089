package com.clouds.algo.palindrom;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * @author clouds
 * @version 1.0
 */
class PalindromeStrTest {

    @Test
    void isPalindrome() {
        PalindromeStr palindromeStr = new PalindromeStr();
        assertTrue(palindromeStr.isPalindrome(""));
        assertTrue(palindromeStr.isPalindrome("a"));
        assertTrue(palindromeStr.isPalindrome("aa"));
        assertFalse(palindromeStr.isPalindrome("ab"));
        assertTrue(palindromeStr.isPalindrome("aba"));
        assertTrue(palindromeStr.isPalindrome("abba"));
        assertTrue(palindromeStr.isPalindrome("abcba"));
        assertFalse(palindromeStr.isPalindrome("abcdba"));
    }

    @Test
    void isPalindrome2() {
        PalindromeStr palindromeStr = new PalindromeStr();
        assertTrue(palindromeStr.isPalindrome2(""));
        assertTrue(palindromeStr.isPalindrome2("a"));
        assertTrue(palindromeStr.isPalindrome2("aa"));
        assertFalse(palindromeStr.isPalindrome2("ab"));
        assertTrue(palindromeStr.isPalindrome2("aba"));
        assertTrue(palindromeStr.isPalindrome2("abba"));
        assertTrue(palindromeStr.isPalindrome2("abcba"));
        assertFalse(palindromeStr.isPalindrome2("abcdba"));
    }
}