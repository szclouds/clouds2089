package com.clouds.algo.leetcode;

/**
 * @author clouds
 * @version 1.0
 */
public class Solution1870 {
    /**
     * 准时到达的列车最小时速
     * 二分查找解决，不断试探最小速度
     *
     * @param dist 距离数组
     * @param hour 目标小时数，最终结果需小于等于该值
     * @return 结果
     * @link <a href="https://leetcode.cn/problems/minimum-speed-to-arrive-on-time/">...</a>
     */
    public int minSpeedOnTime(int[] dist, double hour) {
        int low = 0;
        int high = (int) 1e7;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (check(dist, mid, hour)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (high == (int) 1e7) {
            return -1;
        }
        return high + 1;
    }

    private boolean check(int[] dist, int speed, double hour) {
        double sum = 0;
        for (int i = 0; i < dist.length; i++) {
            // 求解耗时
            double cost = dist[i] * 1.0 / speed;
            // 判断是否为最后一个元素，非最后一个元素，则取第一个大于等于cost的整数
            sum += (i == dist.length - 1) ? cost : Math.ceil(cost);
        }
        return sum <= hour;
    }
}
