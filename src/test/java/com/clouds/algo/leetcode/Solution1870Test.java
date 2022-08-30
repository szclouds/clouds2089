package com.clouds.algo.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * @author clouds
 * @version 1.0
 */
class Solution1870Test {

    @Test
    void minSpeedOnTime() {
        Solution1870 solution1870 = new Solution1870();
        int[] nums = new int[]{1, 3, 2};
        assertEquals(solution1870.minSpeedOnTime(nums, 6), 1);
        assertEquals(solution1870.minSpeedOnTime(new int[]{1, 3, 2}, 2.7), 3);
        assertEquals(solution1870.minSpeedOnTime(new int[]{1, 3, 2}, 1.9), -1);
    }
}