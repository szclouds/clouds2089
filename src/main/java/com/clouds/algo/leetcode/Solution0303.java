package com.clouds.algo.leetcode;

/**
 * @author clouds
 * @version 1.0
 */
public class Solution0303 {
    private final int[] sums;

    public Solution0303(int[] nums) {
        this.sums = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            this.sums[i + 1] = sums[i] + nums[i];
        }
    }

    /**
     * 区域和检索 - 数组不可变
     *
     * @param left  左索引
     * @param right 右索引
     * @return 计算索引 left 和 right （包含 left 和 right）之间的 nums 元素的 和 ，其中 left <= right
     * @link <a href="https://leetcode.cn/problems/range-sum-query-immutable/">...</a>
     */
    public int sumRange(int left, int right) {
        return this.sums[right + 1] - this.sums[left];
    }
}
