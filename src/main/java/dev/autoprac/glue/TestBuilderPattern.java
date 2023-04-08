package dev.autoprac.glue;

public class TestBuilderPattern {
    public  static void main(String [] args){
            NutritionFacts nutritionFacts = new NutritionFacts.Builder(10, 20).addCalories(5).addCarb(6).fat(9).build();

        System.out.println(nutritionFacts.getCalories());
        System.out.println(nutritionFacts.getServings());
        System.out.println(nutritionFacts.getServingSize());
        System.out.println(nutritionFacts.getFat());
        System.out.println(nutritionFacts.getSodium());
        System.out.println(nutritionFacts.getCalories());

    }
}
