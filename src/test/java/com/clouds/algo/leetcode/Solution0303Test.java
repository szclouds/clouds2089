package com.clouds.algo.leetcode;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * @author clouds
 * @version 1.0
 */
class Solution0303Test {

    @Test
    void sumRange() {
        Solution0303 solution = new Solution0303(new int[]{-2, 0, 3, -5, 2, -1});
        assertEquals(solution.sumRange(0, 2), 1);
        assertEquals(solution.sumRange(2, 5), -1);
        assertEquals(solution.sumRange(0, 5), -3);
    }
}