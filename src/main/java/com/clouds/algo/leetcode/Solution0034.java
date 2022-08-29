package com.clouds.algo.leetcode;

/**
 * @author clouds
 * @version 1.0
 */
public class Solution0034 {

    /**
     * 在排序数组中查找元素的第一个和最后一个位置
     *
     * @param nums   已排序递增数组
     * @param target 目标值
     * @return 返回数组，分别为第一个位置和最后一个位置
     * @link <a href="https://leetcode.cn/problems/find-first-and-last-position-of-element-in-sorted-array/">...</a>
     */
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[]{-1, -1};
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                if (mid == 0) {
                    ans[0] = mid;
                    break;
                }
                if (nums[mid - 1] != target) {
                    ans[0] = mid;
                    break;
                } else {
                    high = mid - 1;
                }
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        low = 0;
        high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                if (mid + 1 == nums.length) {
                    ans[1] = mid;
                    break;
                }
                if (nums[mid + 1] != target) {
                    ans[1] = mid;
                    break;
                } else {
                    low = mid + 1;
                }
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}
