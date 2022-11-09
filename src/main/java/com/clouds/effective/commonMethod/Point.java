package com.clouds.effective.commonMethod;

import java.util.Objects;

/**
 * @author clouds
 * @version 1.0
 */
public class Point {
    private final int x;
    private final int y;
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
