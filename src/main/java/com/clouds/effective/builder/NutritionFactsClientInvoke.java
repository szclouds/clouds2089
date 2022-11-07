package com.clouds.effective.builder;

/**
 * @author clouds
 * @version 1.0
 */
public class NutritionFactsClientInvoke {
    public static void main(String[] args) {
        // builder 创建营养成分对象-调用示例
        NutritionFacts nutritionFacts = new NutritionFacts.Builder(1, 5).build();
        System.out.println(nutritionFacts.toString());
    }
}
