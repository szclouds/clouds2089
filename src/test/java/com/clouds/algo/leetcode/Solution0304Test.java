package com.clouds.algo.leetcode;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * @author clouds
 * @version 1.0
 */
class Solution0304Test {

    @Test
    void sumRegion() {
        Solution0304 solution = new Solution0304(new int[][]{{3, 0, 1, 4, 2}, {5, 6, 3, 2, 1}, {1, 2, 0, 1, 5}, {4, 1, 0, 1, 7}, {1, 0, 3, 0, 5}});
        assertEquals(solution.sumRegion(2, 1, 4, 3), 8);
        assertEquals(solution.sumRegion(1, 1, 2, 2), 11);
        assertEquals(solution.sumRegion(1, 2, 2, 4), 12);
    }
}