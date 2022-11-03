package com.clouds.algo.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author clouds
 * @version 1.0
 */
public class Solution0406 {
    /**
     * 根据身高重建队列
     * 假设有打乱顺序的一群人站成一个队列，数组 people 表示队列中一些人的属性（不一定按顺序）。每个 people[i] = [hi, ki] 表示第 i 个人的身高为 hi ，前面 正好 有 ki 个身高大于或等于 hi 的人。
     * 请你重新构造并返回输入数组 people 所表示的队列。返回的队列应该格式化为数组 queue ，其中 queue[j] = [hj, kj] 是队列中第 j 个人的属性（queue[0] 是排在队列前面的人）。
     *
     * @param people 原始数组
     * @return 返回满足条件的数组
     * @link <a href="https://leetcode.cn/problems/queue-reconstruction-by-height/description/">...</a>
     */
    public int[][] reconstructQueue(int[][] people) {
        // 对二维数组进行排序，先以元素1进行降序排序，再以元素2进行升序排序
        Stream<int[]> stream = Arrays.stream(people).sorted((o1, o2) -> {
            if (o1[0] != o2[0]) {
                return o2[0] - o1[0];
            } else {
                return o1[1] - o2[1];
            }
        });
        // 存储结果
        List<int[]> list = new LinkedList<>();
        // 判断位置2的元素与list长度大小关系，若大于则说明将该值添加到list尾部即可，若小于等于则将该值插入到指定的位置中
        stream.forEach((x) -> {
            if (x[1] > list.size()) {
                list.add(x);
            } else {
                list.add(x[1], x);
            }
        });
        return list.toArray(new int[list.size()][]);
    }
}
