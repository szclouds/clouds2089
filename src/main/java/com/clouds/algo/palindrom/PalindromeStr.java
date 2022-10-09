package com.clouds.algo.palindrom;

public class PalindromeStr {

    /**
     * 获取从后往前的字符串进行比较
     *
     * @param str 输入字符串
     * @return true ｜ false
     */
    public boolean isPalindrome(String str) {
        if (str.length() < 1) {
            return true;
        }
        String[] strings = str.split("");
        StringBuilder sb = new StringBuilder();
        for (int i = strings.length - 1; i >= 0; i--) {
            sb.append(strings[i]);
        }
        return sb.toString().equals(str);
    }

    /**
     * 双指针完成回文字符串判断
     *
     * @param str 输入字符串
     * @return true ｜ false
     */
    public boolean isPalindrome2(String str) {
        if (str.length() < 1) {
            return true;
        }
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
