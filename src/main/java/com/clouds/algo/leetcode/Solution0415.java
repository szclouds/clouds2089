package com.clouds.algo.leetcode;

/**
 * @author clouds
 * @version 1.0
 */
public class Solution0415 {
    /**
     * 字符串相加
     *
     * @param num1 字符串1
     * @param num2 字符串2
     * @return 返回相加后的字符串结果
     * @link <a href="https://leetcode.cn/problems/add-strings/">...</a>
     */
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        StringBuilder sb = new StringBuilder();
        int tempVal = 0;
        while (i >= 0 || j >= 0) {
            int addVal1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int addVal2 = j >= 0 ? num2.charAt(j) - '0' : 0;
            int res = addVal1 + addVal2 + tempVal;
            sb.append(res % 10);
            tempVal = res / 10;
            i--;
            j--;
        }
        if (tempVal != 0) {
            sb.append(tempVal);
        }
        return sb.reverse().toString();
    }
}
