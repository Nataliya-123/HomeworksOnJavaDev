package Homework.homeappliances;

public  class Appliances implements Elecrtricity {
    //Определить иерархию домашней техники.
    //Включить некоторые в розетку.
    //Рассчитать потребляемую мощность.
    //Провести сортировку приборов в квартире на основе одного из параметров.
    //Найти кухонный прибор в квартире, соответствующий заданному диапазону параметров.

    private int currentStrengthAmperes; //сила тока в амперах


    @Override
    public int culculatePower(int voltageInVolt) {
        return voltageInVolt*getCurrentStrengthAmperes();
    }

    public Appliances(int currentStrengthAmperes) {
        this.currentStrengthAmperes = currentStrengthAmperes;
    }

    public Appliances(){
    }

    public int getCurrentStrengthAmperes() {
        return currentStrengthAmperes;
    }

    public boolean isOn() {
        return true;
    }
}