package com.clouds.algo.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author clouds
 * @version 1.0
 */
public class Solution0006 {
    /**
     * N 字形变换
     *
     * @param s       目标字符串
     * @param numRows 行数
     * @return 结果字符串
     * @link <a href="https://leetcode.cn/problems/zigzag-conversion/description/">...</a>
     */
    public String convert(String s, int numRows) {
        if (numRows < 2) {
            return s;
        }
        // 存储每行的字符串
        List<StringBuilder> list = new ArrayList<>();
        // 初始化行
        for (int i = 0; i < numRows; i++) {
            list.add(new StringBuilder());
        }
        // 标识，从上到下/从下到上
        int flag = -1;
        // 游标
        int i = 0;
        // 遍历字符串
        for (char c : s.toCharArray()) {
            list.get(i).append(c);
            // 判断第一行和最后一行
            if (i == 0 || i == numRows - 1) {
                flag = -flag;
            }
            i = i + flag;
        }
        // 结果汇总
        StringBuilder ret = new StringBuilder();
        for (StringBuilder sb : list) {
            ret.append(sb);
        }
        return ret.toString();
    }
}
