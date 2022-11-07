package com.clouds.effective.builder;

import static com.clouds.effective.builder.NyPizza.Size.SMALL;
import static com.clouds.effective.builder.Pizza.Topping.HAM;
import static com.clouds.effective.builder.Pizza.Topping.ONION;
import static com.clouds.effective.builder.Pizza.Topping.SAUSAGE;

/**
 * @author clouds
 * @version 1.0
 */
public class PizzaClientInvoke {
    public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(SMALL)
                .addTopping(SAUSAGE)
                .addTopping(ONION)
                .build();
        Calzone calzone = new Calzone.Builder()
                .sauceInside()
                .addTopping(HAM)
                .build();

        System.out.println(pizza);
        System.out.println(calzone);
    }
}
