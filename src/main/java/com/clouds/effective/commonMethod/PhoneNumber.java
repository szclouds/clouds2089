package com.clouds.effective.commonMethod;

/**
 * @author clouds
 * @version 1.0
 */
public class PhoneNumber {
    private final short areaCode, prefix, lineNum;

    public PhoneNumber(short areaCode, short prefix, short lineNum) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNum = lineNum;
    }

    public short getAreaCode() {
        return areaCode;
    }

    public short getPrefix() {
        return prefix;
    }

    public short getLineNum() {
        return lineNum;
    }

    /**
     * 重写equals方法
     *
     * @param o 入参object
     * @return tru | false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PhoneNumber)) return false;
        PhoneNumber that = (PhoneNumber) o;
        return areaCode == that.areaCode && prefix == that.prefix && lineNum == that.lineNum;
    }

    /**
     * 重写equals方法必须冲洗hashCode方法
     *
     * @return int hash值
     */
    @Override
    public int hashCode() {
        // 使用Objects静态的方法执行速度过慢，传递的是可变参数，以及基本类型将要面临拆箱和装箱所带来的性能损耗
        //return Objects.hash(areaCode, prefix, lineNum);
        // 所有对象实例都返回同一个值——一个糟糕的实现方式，每个对象hash到了一个桶中，哈希结构退化成链表结构，
        // 运行时间从线性时间变为平方级别当数据量大时将会影响运行性能
        //return 42;

        // 自定义实现计算哈希值,选择31的原因：素数、奇数同时有31 * i ==（i << 5） - i 现代化的JVM可自动进行优化计算
        int resultHash = Short.hashCode(areaCode);
        resultHash = Short.hashCode(prefix) + 31 * resultHash;
        resultHash = Short.hashCode(lineNum) + 31 * resultHash;
        return resultHash;

        // 对hash值计算复杂的对象提供hash值缓存功能，提升运行效率，可在创建对象或第一次调用时实现懒加载，第一次懒加载时需注意保证线程安全
        //int result = hashCode;
        //if (result == 0) {
        //    result = Short.hashCode(areaCode);
        //    result = 31 * result + Short.hashCode(prefix);
        //    result = 31 * result + Short.hashCode(lineNum);
        //    hashCode = result;
        //}
        //return result;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "areaCode=" + areaCode +
                ", prefix=" + prefix +
                ", lineNum=" + lineNum +
                '}';
    }
}
