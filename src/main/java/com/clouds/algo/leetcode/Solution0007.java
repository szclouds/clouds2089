package com.clouds.algo.leetcode;

/**
 * @author clouds
 * @version 1.0
 */
public class Solution0007 {
    /**
     * 整数反转：
     * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
     * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
     * 假设环境不允许存储 64 位整数（有符号或无符号）。
     *
     * @param x 目标数字
     * @return 反转结果
     * @link <a href="https://leetcode.cn/problems/reverse-integer/description/">...</a>
     */
    public int reverse(int x) {
        int ret = 0;
        while (x != 0) {
            // 关键点 防止溢出 提前判断
            if (ret < Integer.MIN_VALUE / 10 || ret > Integer.MAX_VALUE / 10) {
                return 0;
            }
            ret = ret * 10 + x % 10;
            x = x / 10;
        }
        return ret;
    }
}
