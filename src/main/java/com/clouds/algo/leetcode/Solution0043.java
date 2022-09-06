package com.clouds.algo.leetcode;

/**
 * @author clouds
 * @version 1.0
 */
public class Solution0043 {
    /**
     * 字符串相乘
     *
     * @param num1 字符串形式表示的非负整数
     * @param num2 字符串形式表示的非负整数
     * @return 返回 num1 和 num2 的乘积，它们的乘积也表示为字符串形式
     * @link <a href="https://leetcode.cn/problems/multiply-strings/">...</a>
     */
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        int m = num1.length() - 1;
        int n = num2.length() - 1;
        String ret = "0";
        for (int i = n; i >= 0; i--) {
            StringBuilder curr = new StringBuilder();
            // 补零 乘法运算每操作一位数后结果往前移动一位
            for (int j = n ; j > i; j--) {
                curr.append("0");
            }
            int x = num2.charAt(i) - '0';
            int add = 0;
            for (int j = m; j >= 0; j--) {
                int y = num1.charAt(j) - '0';
                int z = x * y + add;
                curr.append(z % 10);
                add = z / 10;
            }
            if (add != 0) {
                curr.append(add);
            }
            ret = addStrings(ret, curr.reverse().toString());
        }
        return ret;
    }

    private String addStrings(String s1, String s2) {
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        StringBuilder sb = new StringBuilder();
        int tempVal = 0;
        while (i >= 0 || j >= 0) {
            int value1 = i >= 0 ? s1.charAt(i) - '0' : 0;
            int value2 = j >= 0 ? s2.charAt(j) - '0' : 0;
            int sum = value1 + value2+tempVal;
            sb.append(sum % 10);
            tempVal = sum / 10;
            i--;
            j--;
        }
        if (tempVal != 0) {
            sb.append(tempVal);
        }
        return sb.reverse().toString();
    }
}
