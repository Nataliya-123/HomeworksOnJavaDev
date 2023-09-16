package Homework.HW10.enam;

public class MethodIsVegetarian {

    public static  boolean isVegetarian(Food[] foods) {
        for (Food food : foods) {
            if (food.getFoodType().equals(FoodType.MEAT) || food.getFoodType().equals(FoodType.MILK) || food
                    .getFoodType().equals(FoodType.UNKNOWN) || food.getFoodType().equals(FoodType.FISH)) {
                return false;
            }
        }
        return true;
    }
}
