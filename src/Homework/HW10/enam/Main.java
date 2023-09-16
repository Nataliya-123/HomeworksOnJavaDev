package Homework.HW10.enam;

public class Main {
    public static void main(String[] args) {
        //Создать enum - FoodType (MEAT, FISH, FRUIT, VEGETABLE, MILK, UNKNOWN)
        // ○    Создать базовый абстрактный класс Food и в нем абстрактный метод public FoodType getFoodType();
        // ○    Создать 2-3 класса наследника Food и реализовать методы get/set name, a также переопределить getFoodType для каждого.
        // ○    Создать отдельный класс с методом проверок boolean isVegetarian(Food[] foods) в метод передается набор ингредиентов,
        //         на выходе true если все они вегетарианские.


        MeatFood meat = new MeatFood("meat");
        MilkFood milk = new MilkFood("milk");
        OtherFood otherFood = new OtherFood("eggs");
        Vegetable potato = new Vegetable("potato");
        Vegetable zucchini = new Vegetable("potato");
        Vegetable onion = new Vegetable("onion");

        Food[] burger = {meat, otherFood, milk, potato};
        System.out.println(MethodIsVegetarian.isVegetarian(burger));

        Food[] vegetableCasserole = {zucchini, onion};
        System.out.println(MethodIsVegetarian.isVegetarian(vegetableCasserole));


    }

}
