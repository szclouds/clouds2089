package com.clouds.algo.leetcode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

/**
 * @author clouds
 * @version 1.0
 */
class Solution0034Test {
    @Test
    void testSearchRange() {
        int[] nums = new int[]{5, 7, 7, 8, 8, 10};
        Solution0034 solution = new Solution0034();
        int[] ret = solution.searchRange(nums, 8);
        assertArrayEquals(ret, new int[]{3, 4});
        assertArrayEquals(solution.searchRange(new int[]{1}, 1), new int[]{0, 0});
        assertArrayEquals(solution.searchRange(new int[]{5,7,7,8,8,10}, 6), new int[]{-1,-1});
        assertArrayEquals(solution.searchRange(new int[]{}, 0), new int[]{-1,-1});
    }
}