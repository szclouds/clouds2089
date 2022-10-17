package com.clouds.algo.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author clouds
 * @version 1.0
 */
public class Solution0020 {

    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                if (stack.empty()) {
                    return false;
                }
                char temp = stack.pop();
                if (!map.get(c).equals(temp)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.empty();
    }
}
