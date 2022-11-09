package com.clouds.effective.commonMethod;

import java.util.Objects;

/**
 * 优先使用组合而非继承
 *
 * @author clouds
 * @version 1.0
 */
public class ColorPoint {
    private final String color;
    // 组合Point对象
    private final Point point;

    public ColorPoint(int x, int y, String color) {
        this.point = new Point(x, y);
        this.color = color;
    }

    public Point getPoint() {
        return point;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        // 引用相等则直接返回
        if (this == o) return true;
        // 判断实例类型
        if (!(o instanceof ColorPoint)) return false;
        // 强制类型转换
        ColorPoint that = (ColorPoint) o;
        // 判断颜色再判断组合类型point，point判断回归其本身
        return Objects.equals(color, that.color) && this.point.equals(that.point);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, point);
    }
}
