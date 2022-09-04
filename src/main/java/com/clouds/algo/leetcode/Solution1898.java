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
            if (checkSubsequence(str, p)) {
                if (mid + 1 == removable.length || !checkSubsequence(getStr(s, removable, mid + 1), p)) {
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

    public boolean checkSubsequence(String t, String s) {
        // t字符串长度
        int m = t.length();
        // s字符串长度
        int n = s.length();
        // 双指针 i j
        int i = 0;
        int j = 0;
        // 循环遍历t和s，当其中一个字符串遍历完成后则停止
        while (i < m && j < n) {
            // 比较字符
            if (s.charAt(j) == t.charAt(i)) {
                // s字符串只有当匹配后才前进
                j++;
            }
            // t字符串始终往前进
            i++;
        }
        // 判断s字符串是否完成匹配完成
        return j == n;
    }
}
