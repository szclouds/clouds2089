package com.clouds.algo.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * @author clouds
 * @version 1.0
 */
class Solution0415Test {

    @Test
    void addStrings() {
        Solution0415 solution = new Solution0415();
        assertEquals(solution.addStrings("11", "123"), "134");
        assertEquals(solution.addStrings("456", "77"), "533");
        assertEquals(solution.addStrings("0", "0"), "0");
        assertEquals(solution.addStrings("9", "99"), "108");
    }
}