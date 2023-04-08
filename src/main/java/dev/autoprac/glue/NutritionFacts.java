package dev.autoprac.glue;

import lombok.Getter;

@Getter
public class NutritionFacts {

    private final int servings;
    private final int servingSize;
    private final int sodium;
    private final int calories;
    private final int fat;
    private final int carbohydrate;

    public static class Builder{
        private int servings;
        private int servingSize;

        private int sodium = 0;
        private int calories = 0;
        private int fat = 0;
        private int carbohydrate = 0;


        public Builder(int servings, int servingSize){
            this.servings = servings;
            this.servingSize = servingSize;
        }

        public Builder addSodium(int sodium){
            this.sodium =sodium;
            return this;
        }

        public Builder addCalories(int calories){
            this.calories = calories;
            return this;
        }

        public Builder fat(int fat){
            this.fat = fat;
            return this;
        }
        public Builder getCalories(int calories){
            this.calories = calories;
            return this;
        }

        public Builder addCarb(int carb){
            this.carbohydrate = carb;
            return this;
        }

        public NutritionFacts build(){
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder){
        servings = builder.servings;
        servingSize = builder.servingSize;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
        calories = builder.calories;
    }
}
