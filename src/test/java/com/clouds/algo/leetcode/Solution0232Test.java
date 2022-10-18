package com.clouds.algo.leetcode;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * @author clouds
 * @version 1.0
 */
class Solution0232Test {

    @Test
    void test() {
        Solution0232 solution0232 = new Solution0232();
        solution0232.push(3);
        solution0232.push(2);
        solution0232.push(1);
        assert !solution0232.empty();
        assert solution0232.peek()==3;
        assert solution0232.pop()==3;
        assert solution0232.pop()==2;
        assert solution0232.pop()==1;
        assert solution0232.empty();
    }
}