package com.clouds.algo.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * @author clouds
 * @version 1.0
 */
class Solution1898Test {

    @Test
    void maximumRemovals() {
        Solution1898 solution1898 = new Solution1898();
        assertEquals(solution1898.maximumRemovals("abcacb", "ab", new int[]{3, 1, 0}), 2);
        assertEquals(solution1898.maximumRemovals("abcbddddd", "abcd", new int[]{3, 2, 1, 4, 5, 6}), 1);
        assertEquals(solution1898.maximumRemovals("abcab", "abc", new int[]{0, 1, 2, 3, 4}), 0);
    }
}