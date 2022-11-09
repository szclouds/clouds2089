package com.clouds.effective.commonMethod;

import java.util.Objects;

/**
 * equals对称性案例
 *
 * @author clouds
 * @version 1.0
 */
public class CaseInsensitiveString {
    private final String s;

    public CaseInsensitiveString(String val) {
        this.s = Objects.requireNonNull(val);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CaseInsensitiveString)) return false;
        CaseInsensitiveString that = (CaseInsensitiveString) o;
        return this.s.equalsIgnoreCase(that.s);
    }

    // 错误实现方式
    //@Override
    //public boolean equals(Object o) {
    //    if (this == o) return true;
    //    if (o instanceof CaseInsensitiveString) {
    //        CaseInsensitiveString that = (CaseInsensitiveString) o;
    //        return this.s.equalsIgnoreCase(that.s);
    //    }
    //    if (o instanceof String) {
    //        return ((String) o).equalsIgnoreCase(this.s);
    //    }
    //    return false;
    //}

    @Override
    public int hashCode() {
        return Objects.hash(s);
    }

    public static void main(String[] args) {
        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        String s = "polish";
        System.out.println(cis.equals(s));
        System.out.println(s.equals(cis));
    }
}
