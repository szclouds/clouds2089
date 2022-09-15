package com.clouds.algo.leetcode;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * @author clouds
 * @version 1.0
 */
class Solution0370Test {

    @Test
    void getModifiedArray() {
        Solution0370 solution = new Solution0370();
        assertArrayEquals(new int[]{-2, 0, 3, 5, 3}, solution.getModifiedArray(5, new int[][]{{1, 3, 2}, {2, 4, 3}, {0, 2, -2}}));
        assertArrayEquals(new int[]{1, 3, 0, 2, 0}, solution.getModifiedArray(5, new int[][]{{1, 3, 2}, {0, 1, 3}, {0, 2, -2}}));
    }
}