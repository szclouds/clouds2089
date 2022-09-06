package com.clouds.algo.leetcode;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * @author clouds
 * @version 1.0
 */
class Solution0043Test {

    @Test
    void multiply() {
        Solution0043 solution = new Solution0043();
        assertEquals(solution.multiply("0", "0"), "0");
        assertEquals(solution.multiply("0", "1"), "0");
        assertEquals(solution.multiply("2", "3"), "6");
        assertEquals(solution.multiply("123", "456"), "56088");
        assertEquals(solution.multiply("9", "99"), "891");
    }
}