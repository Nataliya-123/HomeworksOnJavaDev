package Homework.homeappliances;

public class Main {
    public static void main(String[] args) {

        KitchenAppliances kitchenAppliances = new KitchenAppliances();
        BeautyHomeAppliances beautyHomeAppliances = new BeautyHomeAppliances();

        BeautyHomeAppliances hairDryer = new BeautyHomeAppliances(10);
        BeautyHomeAppliances hairStraightener = new BeautyHomeAppliances(15);
        KitchenAppliances electricStove = new KitchenAppliances(120);

        System.out.println("Мощность фена составляет: " + hairDryer.culculatePower(Elecrtricity.voltageInVolt));
        System.out.println("Мощность утюжка для волос составляет: " + hairStraightener.culculatePower(Elecrtricity.voltageInVolt));
        System.out.println("Мощность плиты составляет: " + electricStove.culculatePower(Elecrtricity.voltageInVolt));

        System.out.println("Фен для волос включён " + hairDryer.isOn());
        System.out.println("Утюжок для волос включён " + hairStraightener.isOn());
        System.out.println("Плита для волос включён " + electricStove.isOn());

        beautyHomeAppliances.addBeautyApp(hairDryer);
        beautyHomeAppliances.addBeautyApp(hairStraightener);
        kitchenAppliances.addKitchenAppl(electricStove);

        System.out.println("Общая мощность кухонных приборов составляет: " + kitchenAppliances.culculateCommonKitchenPower());
        System.out.println("Общая мощность  приборов для красоты составляет: " + beautyHomeAppliances.calculateCommonPowerOfBeauty());

        beautyHomeAppliances.printbeautyHomeAppliance();
        beautyHomeAppliances.sortBeautyApplianceByPower();
        beautyHomeAppliances.printbeautyHomeAppliance();

        kitchenAppliances.printKitchenAppliances();
        kitchenAppliances.sortKitchenApplianceByPower();
        kitchenAppliances.printKitchenAppliances();
    }
}