package com.clouds.algo.leetcode;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * @author clouds
 * @version 1.0
 */
class Solution0012Test {

    @Test
    void intToRoman() {
        Solution0012 solution = new Solution0012();
        assertEquals("III", solution.intToRoman(3));
        assertEquals("IV", solution.intToRoman(4));
        assertEquals("IX", solution.intToRoman(9));
        assertEquals("MCMXCIV", solution.intToRoman(1994));
    }
}