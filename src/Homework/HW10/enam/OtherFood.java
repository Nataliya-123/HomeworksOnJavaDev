package Homework.HW10.enam;

public class OtherFood extends Food{

    private String name;

    public OtherFood(String name) {
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
        return FoodType.valueOf(String.valueOf(FoodType.UNKNOWN));
    }
}
