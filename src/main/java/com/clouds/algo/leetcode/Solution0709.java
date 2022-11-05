package com.clouds.algo.leetcode;

/**
 * @author clouds
 * @version 1.0
 */
public class Solution0709 {
    /**
     * 字符串相加
     *
     * @param s 字符串
     * @return 转换成小写字母
     * @link <a href="https://leetcode.cn/problems/to-lower-case/description/">...</a>
     */
    public String toLowerCase(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (Character.isLetter(arr[i]) && Character.isUpperCase(arr[i])) {
                arr[i] = Character.toLowerCase(arr[i]);
            }
        }
        return new String(arr);
    }

    public String toLowerCase2(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 65 && c <= 90) {
                c = (char) (c + 32);
                //c |=32;
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
