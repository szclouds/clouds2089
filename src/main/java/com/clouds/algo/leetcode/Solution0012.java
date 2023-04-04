package com.clouds.algo.leetcode;

import java.util.Arrays;

/**
 * @author clouds
 * @version 1.0
 */
public class Solution0012 {
    private final int[] nums = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
    private final String[] strs = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

    /**
     * 整数转罗马数字
     *
     * @param num 目标数字
     * @return 罗马数字字符串
     * @link <a href="https://leetcode.cn/problems/integer-to-roman/description/">...</a>
     */
    public String intToRoman(int num) {
        StringBuilder ret = new StringBuilder();
        recursive(num, ret);
        return ret.toString();
    }

    public void recursive(int num, StringBuilder sb) {
        int index = Arrays.binarySearch(nums, num);
        if (index >= 0) {
            sb.append(strs[index]);
            return;
        }
        int findIndex = binarySearch(num);
        if (findIndex == -1) {
            return;
        }
        sb.append(strs[findIndex]);
        int newNum = num - nums[findIndex];
        if (newNum != 0) {
            recursive(newNum, sb);
        }
    }

    /**
     * 二分查找-寻找最后一个小于等于给定元素的索引
     *
     * @param num 目标元素
     * @return 索引
     */
    public int binarySearch(int num) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] <= num) {
                if (mid == nums.length - 1 || nums[mid + 1] > num) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
