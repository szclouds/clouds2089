package com.clouds.effective.commonMethod;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * @author clouds
 * @version 1.0
 */
public class CompareTest {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("10.0");
        BigDecimal bigDecimal1 = new BigDecimal("10.00");
        HashSet<BigDecimal> hashSet = new HashSet<>();
        hashSet.add(bigDecimal);
        hashSet.add(bigDecimal1);
        // 2 使用equals方法进行比较
        System.out.println("hashSet.size()=" + hashSet.size());

        TreeSet<BigDecimal> treeSet = new TreeSet<>();
        treeSet.add(bigDecimal);
        treeSet.add(bigDecimal1);
        // 1 使用compareTo方法进行比较
        System.out.println("treeSet.size()=" + treeSet.size());
    }
}
