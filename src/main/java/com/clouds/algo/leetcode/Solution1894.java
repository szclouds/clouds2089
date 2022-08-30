package com.clouds.algo.leetcode;

/**
 * @author clouds
 * @version 1.0
 */
public class Solution1894 {
    /**
     * 找到需要补充粉笔的学生编号
     * 顺序迭代寻找结果
     *
     * @param chalk 每个学生回答问题所需使用粉笔数
     * @param k     总粉笔数
     * @return 结果
     * @link <a href="https://leetcode.cn/problems/find-the-student-that-will-replace-the-chalk/">...</a>
     */
    public int chalkReplacer(int[] chalk, int k) {
        long sum = 0;
        for (int x : chalk) {
            sum += x;
        }
        k %= sum;
        int ans = -1;
        for (int i = 0; i < chalk.length; i++) {
            if (chalk[i] > k) {
                ans = i;
                break;
            }
            k -= chalk[i];
        }
        return ans;
    }

    /**
     * 二分查找实现
     *
     * @param chalk 每个学生回答问题所需使用粉笔数
     * @param k     总粉笔数
     * @return 结果
     */
    public int chalkReplacer2(int[] chalk, int k) {
        if (chalk[0] > k) {
            return 0;
        }
        for (int i = 1; i < chalk.length; i++) {
            chalk[i] += chalk[i - 1];
            if (chalk[i] > k) {
                return i;
            }
        }
        k %= chalk[chalk.length - 1];
        int low = 0;
        int high = chalk.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (chalk[mid] > k) {
                if (mid == 0 || chalk[mid - 1] < k) {
                    ans = mid;
                    break;
                }
                if (mid == chalk.length - 1) {
                    ans = mid;
                    break;
                }
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
