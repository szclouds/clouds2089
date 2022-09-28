package com.clouds.algo.leetcode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

/**
 * @author clouds
 * @version 1.0
 */
class Solution0066Test {

    @Test
    void plusOne() {
        Solution0066 solution = new Solution0066();
        assertArrayEquals(new int[]{1}, solution.plusOne(new int[]{0}));
        assertArrayEquals(new int[]{1, 2, 4}, solution.plusOne(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{1, 3, 0}, solution.plusOne(new int[]{1, 2, 9}));
        assertArrayEquals(new int[]{1, 0}, solution.plusOne(new int[]{9}));
        assertArrayEquals(new int[]{1, 0,  0}, solution.plusOne(new int[]{9,9}));
    }
}