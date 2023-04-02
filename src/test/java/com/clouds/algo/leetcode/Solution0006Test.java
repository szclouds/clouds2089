package com.clouds.algo.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * @author clouds
 * @version 1.0
 */
class Solution0006Test {

    @Test
    void convert() {
        Solution0006 solution = new Solution0006();
        assertEquals("PAHNAPLSIIGYIR", solution.convert("PAYPALISHIRING", 3));
        assertEquals("PINALSIGYAHRPI", solution.convert("PAYPALISHIRING", 4));
        assertEquals("A", solution.convert("A", 1));
    }
}