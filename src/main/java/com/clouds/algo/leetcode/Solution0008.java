package com.clouds.algo.leetcode;

/**
 * @author clouds
 * @version 1.0
 */
public class Solution0008 {
    /**
     * 字符串转换整数 (atoi)
     *
     * @param s 目标字符串
     * @return 数字
     * @link <a href="https://leetcode.cn/problems/string-to-integer-atoi/description/">...</a>
     */
    public int myAtoi(String s) {
        int length = s.length();
        if (length < 1) {
            return 0;
        }
        // 标识正数或负数
        int sign = 1;
        // 迭代下标
        int i = 0;
        // 结果
        int ret = 0;
        // 跳过空格
        while (i < length && s.charAt(i) == ' ') {
            i++;
        }
        // 判断是否到字符串尾部
        if (i == length) {
            return 0;
        }
        // 判断 正/负 此处存在 +-12 字符，故 i 只能加一次 否则结果不正确
        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            if (s.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }
        // 进行遍历计算结果数值
        while (i < length && Character.isDigit(s.charAt(i))) {
            // 通过与字符 '0' 相减获取结果
            int digit = s.charAt(i) - '0';
            // 提前判断后续的加法是否会溢出 使用最大值减去 digit 除以 10 进行判断
            if (ret > (Integer.MAX_VALUE - digit) / 10) {
                return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            // 结果拼接
            ret = ret * 10 + digit;
            // 下标自增
            i++;
        }
        // 结果与符号位相乘
        return ret * sign;
    }
}
