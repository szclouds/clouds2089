package com.clouds.algo.sorts;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

/**
 * @author clouds
 * @version 1.0
 */
class MergeSortTest {

    @Test
    void mergeSort() {
        // leetcode url https://leetcode.cn/problems/sort-an-array/
        int[] nums = new int[]{24, 3, 15, 6, -6, 8, -111, 0, 1, 1, 1, 1,};
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(nums, 0, nums.length - 1);
        assert Arrays.equals(nums, new int[]{-111, -6, 0, 1, 1, 1, 1, 3, 6, 8, 15, 24});

        int[] nums2 = new int[]{1};
        mergeSort.mergeSort(nums2, 0, nums2.length - 1);
        assert Arrays.equals(nums2, new int[]{1});

        int[] nums3 = new int[]{1, 1};
        mergeSort.mergeSort(nums3, 0, nums3.length - 1);
        assert Arrays.equals(nums3, new int[]{1, 1});

        int[] nums4 = new int[]{1, 2};
        mergeSort.mergeSort(nums4, 0, nums3.length - 1);
        assert Arrays.equals(nums4, new int[]{1, 2});

        int[] nums5 = new int[]{};
        mergeSort.mergeSort(nums5, 0, nums5.length - 1);
        assert Arrays.equals(nums5, new int[]{});

        int[] nums6 = new int[]{5, 2, 3, 1};
        mergeSort.mergeSort(nums6, 0, nums6.length - 1);
        assert Arrays.equals(nums6, new int[]{1, 2, 3, 5});

        int[] nums7 = new int[]{5, 1, 1, 2, 0, 0};
        mergeSort.mergeSort(nums7, 0, nums7.length - 1);
        assert Arrays.equals(nums7, new int[]{0, 0, 1, 1, 2, 5});
    }
}