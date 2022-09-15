package com.clouds.algo.leetcode;

/**
 * @author clouds
 * @version 1.0
 */
public class Solution0370 {
    /**
     * 区间加法
     *
     * @param length  数组初始长度
     * @param updates 三元组：[startIndex, endIndex, inc]，你需要将子数组 A[startIndex ... endIndex]（包括 startIndex 和 endIndex）增加 inc
     * @return 返回 k 次操作后的数组
     * @link <a href="https://doocs.github.io/leetcode/#/solution/0300-0399/0370.Range%20Addition/README">...</a>
     */
    public int[] getModifiedArray(int length, int[][] updates) {
        int[] ret = new int[length];
        for (int[] t : updates) {
            ret[t[0]] += t[2];
            if (t[1] + 1 < length) {
                ret[t[1] + 1] -= t[2];
            }
        }
        for (int i = 1; i < ret.length; i++) {
            ret[i] += ret[i - 1];
        }
        return ret;
    }
}
