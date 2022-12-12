package com.clouds.algo.sorts;

/**
 * @author clouds
 * @version 1.0
 */
public class MergeSort {

    public void mergeSort(int[] nums, int p, int r) {
        if (p >= r) {
            return;
        }
        int q = (r + p) / 2;
        mergeSort(nums, p, q);
        mergeSort(nums, q + 1, r);
        merge(nums, p, q, r);
    }

    public void merge(int[] nums, int p, int q, int r) {
        int[] temp = new int[r - p + 1];
        int k = 0;
        int i = p;
        int j = q + 1;
        while (i <= q && j <= r) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }
        int start = i;
        int end = q;
        if (j <= r) {
            start = j;
            end = r;
        }
        while (start <= end) {
            temp[k++] = nums[start++];
        }
        System.arraycopy(temp, 0, nums, p, temp.length);
    }
}
