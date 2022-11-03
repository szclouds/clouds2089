package com.clouds.algo.leetcode;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;


/**
 * @author clouds
 * @version 1.0
 */
class Solution0406Test {

    @Test
    void reconstructQueue() {
        Solution0406 solution0406 = new Solution0406();
        int[][] res = solution0406.reconstructQueue(new int[][]{{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}});
        assertArrayEquals(new int[][]{{5, 0}, {7, 0}, {5, 2}, {6, 1}, {4, 4}, {7, 1}}, res);
    }
}
