package com.clouds.algo.leetcode;

/**
 * @author clouds
 * @version 1.0
 */
public class Solution0066 {

    /**
     * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
     * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
     * 你可以假设除了整数 0 之外，这个整数不会以零开头。
     * 来源：力扣（LeetCode）
     * 链接：
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param digits 原始数组
     * @return 加一后的数组
     * @link <a href="https://leetcode.cn/problems/plus-one">...</a>
     */
    public int[] plusOne(int[] digits) {
        int add = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == digits.length - 1) {
                add += 1;
            }
            int temp = (digits[i] + add) / 10;
            digits[i] = (digits[i] + add) % 10;
            add = temp;
            if (temp == 0) {
                break;
            }
        }
        if (digits[0] == 0) {
            int[] ret = new int[digits.length + 1];
            ret[0] = add;
            ret[1] = digits[0];
            for (int i = 2; i < ret.length; i++) {
                ret[i] = digits[i - 2];
            }
            return ret;
        }
        return digits;
    }
}
