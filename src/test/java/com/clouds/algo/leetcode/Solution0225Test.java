package com.clouds.algo.leetcode;

import org.junit.jupiter.api.Test;

/**
 * @author clouds
 * @version 1.0
 */
class Solution0225Test {

    @Test
    void test() {
        Solution0225 solution0225 = new Solution0225();
        solution0225.push(1);
        solution0225.push(2);
        assert solution0225.top() == 2;
        assert solution0225.pop() == 2;
        assert !solution0225.empty();
    }
}