package com.clouds.algo.leetcode;

/**
 * @author clouds
 * @version 1.0
 */
public class Solution0304 {
    private final int[][] sums;

    public Solution0304(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        sums = new int[m + 1][n + 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sums[i + 1][j + 1] = sums[i + 1][j] + sums[i][j + 1] - sums[i][j] + matrix[i][j];
            }
        }
    }

    /**
     * 二维区域和检索 - 矩阵不可变
     *
     * @param row1 位置1行
     * @param col1 位置1列
     * @param row2 位置2行
     * @param col2 位置2列
     * @return 计算其子矩形范围内元素的总和，该子矩阵的 左上角 为 (row1, col1) ，右下角 为 (row2, col2) 。
     * @link <a href="https://leetcode.cn/problems/range-sum-query-immutable/">...</a>
     */
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return sums[row2 + 1][col2 + 1] - sums[row1][col2 + 1] - sums[row2 + 1][col1] + sums[row1][col1];
    }
}
