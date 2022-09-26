package com.clouds.algo.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author clouds
 * @version 1.0
 */
public class Solution0003 {

    /**
     * 无重复字符的最长子串-滑动窗口
     *
     * @param s 目标字符串
     * @return 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
     * @link <a href="https://leetcode.cn/problems/longest-substring-without-repeating-characters/">...</a>
     */
    public int lengthOfLongestSubstring(String s) {
        if (s.length() < 2) {
            return s.length();
        }
        Map<Character, Integer> windowsMap = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            if (windowsMap.containsKey(s.charAt(i))) {
                left = Math.max(left, windowsMap.get(s.charAt(i)) + 1);
            }
            windowsMap.put(s.charAt(i), i);
            max = Math.max(max, i - left + 1);
        }
        return max;
    }

    public int lengthOfLongestSubstring2(String s) {
        if (s.length() < 2) {
            return s.length();
        }
        Map<Character, Integer> windowsMap = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int left = 0;
        int right = 0;
        while (right < s.length()) {
            Character curr = s.charAt(right);
            int currCount = windowsMap.get(curr) != null ? windowsMap.get(curr) : 0;
            windowsMap.put(s.charAt(right), currCount + 1);
            right++;
            while (windowsMap.get(curr) > 1) {
                int leftCount = windowsMap.get(s.charAt(left));
                windowsMap.put(s.charAt(left), leftCount - 1);
                left++;
            }
            max = Math.max(max, right - left);
        }
        return max;
    }
}
