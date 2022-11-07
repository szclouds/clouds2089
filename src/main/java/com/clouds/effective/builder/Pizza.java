package com.clouds.effective.builder;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/**
 * 披萨类
 *
 * @author clouds
 * @version 1.0
 */
public class Pizza {
    // 配料枚举
    public enum Topping {
        HAM,
        MUSHROOM,
        ONION,
        PEPPER,
        SAUSAGE
    }

    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        // 创建一个空的枚举set，并制定后续的枚举类型 T 为 Topping
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Pizza build();

        // Subclasses must override this method to return "this"
        protected abstract T self();
    }

    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone(); // See Item 50
    }
}
