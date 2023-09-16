package Homework.HW10.enam;

public class Fruits extends Food{

    private String name;

    public Fruits(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public FoodType getFoodType() {
        return FoodType.valueOf(String.valueOf(FoodType.FRUIT));
    }
}
