package com.clouds.algo.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * @author clouds
 * @version 1.0
 */
class Solution0003Test {

    @Test
    void lengthOfLongestSubstring() {
        Solution0003 solution = new Solution0003();
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
        assertEquals(2, solution.lengthOfLongestSubstring("au"));
        assertEquals(2, solution.lengthOfLongestSubstring("aab"));
    }

    @Test
    void lengthOfLongestSubstring2() {
        Solution0003 solution = new Solution0003();
        assertEquals(3, solution.lengthOfLongestSubstring2("abcabcbb"));
        assertEquals(1, solution.lengthOfLongestSubstring2("bbbbb"));
        assertEquals(3, solution.lengthOfLongestSubstring2("pwwkew"));
        assertEquals(2, solution.lengthOfLongestSubstring2("au"));
        assertEquals(2, solution.lengthOfLongestSubstring2("aab"));
    }
}