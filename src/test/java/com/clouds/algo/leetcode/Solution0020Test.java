package com.clouds.algo.leetcode;

import org.junit.jupiter.api.Test;

/**
 * @author clouds
 * @version 1.0
 */
class Solution0020Test {

    @Test
    void isValid() {
        Solution0020 solution0020 = new Solution0020();
        assert solution0020.isValid("()");
        assert solution0020.isValid("()[]{}");
        assert !solution0020.isValid("(]");
    }
}