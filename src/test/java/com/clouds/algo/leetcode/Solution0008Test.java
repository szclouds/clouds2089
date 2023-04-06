package com.clouds.algo.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * @author clouds
 * @version 1.0
 */
class Solution0008Test {

    @Test
    void myAtoi() {
        Solution0008 solution = new Solution0008();
        assertEquals(42, solution.myAtoi("42"));
        assertEquals(-42, solution.myAtoi("   -42"));
        assertEquals(4193, solution.myAtoi("4193 with words"));
        assertEquals(0, solution.myAtoi("+-4193"));
        assertEquals(Integer.MAX_VALUE, solution.myAtoi("2147483647"));
        assertEquals(Integer.MIN_VALUE, solution.myAtoi("-2147483648"));
        assertEquals(Integer.MIN_VALUE, solution.myAtoi("-2147483649"));
        assertEquals(-2147483647, solution.myAtoi("-2147483647"));
    }
}