package com.clouds.algo.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author clouds
 * @version 1.0
 */
public class Solution1898 {
    /**
     * 可移除字符的最大数目
     *
     * @param s         字符串
     * @param p         s 的一个 子序列
     * @param removable 从 0 开始 计数的整数数组 removable
     * @return 结果
     * @link <a href="https://leetcode.cn/problems/maximum-number-of-removable-characters/">...</a>
     */
    public int maximumRemovals(String s, String p, int[] removable) {
        int low = 0;
        int high = removable.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            String str = getStr(s, removable, mid);
            if (checksSubsequence(str, p)) {
                if (mid + 1 == removable.length || !checksSubsequence(getStr(s, removable, mid + 1), p)) {
                    return mid + 1;
                } else {
                    low = mid + 1;
                }
            } else {
                high = mid - 1;
            }
        }
        return 0;
    }

    private String getStr(String s, int[] nums, int index) {
        StringBuilder sb = new StringBuilder();
        Set<Integer> set = new HashSet<>();
        index = Math.min(index, nums.length - 1);
        for (int i = 0; i <= index; i++) {
            set.add(nums[i]);
        }
        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(i)) {
                String str = String.valueOf(s.charAt(i));
                sb.append(str);
            }
        }
        return sb.toString();
    }

    private boolean checksSubsequence(String t, String s) {
        int n = s.length(), m = t.length();
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == n;
    }
}
