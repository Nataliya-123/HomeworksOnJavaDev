package Homework.homeappliances;

import java.util.Arrays;

public class KitchenAppliances extends Appliances {

    public static final int KITCHEN_APPLIANCES_SIZE = 1;

    private KitchenAppliances[] kitchenAppliances = new KitchenAppliances[KITCHEN_APPLIANCES_SIZE];

    private int kitchenApplianceCurrentSize = 0;


    public int culculateCommonKitchenPower() {
        int power = 0;
        for (int i = 0; i < KITCHEN_APPLIANCES_SIZE; i++) {

            KitchenAppliances kitchen = kitchenAppliances[i];
            if (kitchen != null) {
                power += kitchen.getCurrentStrengthAmperes() * Elecrtricity.voltageInVolt;
            }
        }
        return power;
    }

    public boolean addKitchenAppl(KitchenAppliances kitchenAppliance) {
        if (kitchenApplianceCurrentSize <= kitchenAppliances.length) {
            kitchenAppliances[kitchenApplianceCurrentSize] = kitchenAppliance;
            kitchenApplianceCurrentSize++;
            return true;
        } else {
            return false;
        }
    }

    public int[] addPowerOfKitchenyApplianceToEmptyArray() {
        int[] powerOfKitchenyAppliance = new int[KITCHEN_APPLIANCES_SIZE];
        int power = 0;
        for (int i = 0; i < KITCHEN_APPLIANCES_SIZE; i++) {

            KitchenAppliances kitchen = kitchenAppliances[i];
            if (kitchen != null) {

                power = kitchen.getCurrentStrengthAmperes() * Elecrtricity.voltageInVolt;
                powerOfKitchenyAppliance[i] = power;
            }
        }
        for (int j : powerOfKitchenyAppliance) {
            System.out.println(j);
        }
        return powerOfKitchenyAppliance;
    }


    public KitchenAppliances(int currentStrengthAmperes) {
        super(currentStrengthAmperes);
    }

    public KitchenAppliances() {
        super();

    }

    public void sortKitchenApplianceByPower() {
        for (int i = 0; i < kitchenApplianceCurrentSize-1; i++) {
            for (int j = 0; j < kitchenApplianceCurrentSize-i-1; j++) {
                if (kitchenAppliances[i].getCurrentStrengthAmperes()*Elecrtricity.voltageInVolt > kitchenAppliances[i + 1]
                        .getCurrentStrengthAmperes()*Elecrtricity.voltageInVolt) {
                    KitchenAppliances temp = kitchenAppliances[j];
                    kitchenAppliances[j] = kitchenAppliances[j+1];
                    kitchenAppliances[j + 1] = temp;
                }
            }
        }
    }


    public void printKitchenAppliances(){
        System.out.println(Arrays.toString(kitchenAppliances));
    }

    @Override
    public String toString() {
        return "KitchenAppliances{" +
                "kitchenAppliances=" + Arrays.toString(kitchenAppliances) +
                ", kitchenApplianceCurrentSize=" + kitchenApplianceCurrentSize +
                '}';
    }
}
