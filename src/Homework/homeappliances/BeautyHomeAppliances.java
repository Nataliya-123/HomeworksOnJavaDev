package Homework.homeappliances;
import java.util.Arrays;

public class BeautyHomeAppliances extends Appliances {

    public static final int BEAUTY_APPLIANCE_SIZE = 2;

    private BeautyHomeAppliances[] beautyHomeAppliances = new BeautyHomeAppliances[BEAUTY_APPLIANCE_SIZE];


    private int beautyHomeApplianceCurrentSize = 0;

    public boolean addBeautyApp(BeautyHomeAppliances beautyHomeAppliance) {
        if (beautyHomeApplianceCurrentSize < beautyHomeAppliances.length) {
            beautyHomeAppliances[beautyHomeApplianceCurrentSize] = beautyHomeAppliance;
            beautyHomeApplianceCurrentSize++;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "BeautyHomeAppliances{" +
                "beautyHomeAppliances=" + Arrays.toString(beautyHomeAppliances) +
                '}';
    }

    int calculateCommonPowerOfBeauty() {
        int power = 0;
        for (int i = 0; i < BEAUTY_APPLIANCE_SIZE; i++) {

            BeautyHomeAppliances beauty = beautyHomeAppliances[i];
            if (beauty != null) {
                power += beauty.getCurrentStrengthAmperes() * Elecrtricity.voltageInVolt;
            }
        }
        return power;
    }

    public int[] addPowerOfBeautyApplianceToEmptyArray() {
        int[] powerOfBeautyApplianceArray = new int[BEAUTY_APPLIANCE_SIZE];
        int power = 0;
        for (int i = 0; i < BEAUTY_APPLIANCE_SIZE; i++) {

            BeautyHomeAppliances beauty = beautyHomeAppliances[i];
            if (beauty != null) {

                power = beauty.getCurrentStrengthAmperes() * Elecrtricity.voltageInVolt;
                powerOfBeautyApplianceArray[i] = power;
            }
        }
        for (int j : powerOfBeautyApplianceArray) {
            System.out.println(j);
        }
        return powerOfBeautyApplianceArray;
    }

    public void sortBeautyApplianceByPower() {
        for (int i = 0; i < beautyHomeApplianceCurrentSize-1; i++) {
            for (int j = 0; j < beautyHomeApplianceCurrentSize-i-1; j++) {
                if (beautyHomeAppliances[i].getCurrentStrengthAmperes()*Elecrtricity.voltageInVolt > beautyHomeAppliances[i + 1]
                        .getCurrentStrengthAmperes()*Elecrtricity.voltageInVolt) {
                    BeautyHomeAppliances temp = beautyHomeAppliances[j];
                    beautyHomeAppliances[j] = beautyHomeAppliances[j+1];
                    beautyHomeAppliances[j + 1] = temp;
                }
            }
        }
    }

    public void printbeautyHomeAppliance(){
        System.out.println(Arrays.toString(beautyHomeAppliances));
    }

    public BeautyHomeAppliances(int currentStrengthAmperes) {
        super(currentStrengthAmperes);
    }

    public BeautyHomeAppliances() {
        super();
    }


    @Override
    public boolean isOn() {
        return super.isOn();
    }
}