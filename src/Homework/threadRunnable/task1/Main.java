package Homework.threadRunnable.task1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //1. Пользователь вводит с клавиатуры значение в массив. После чего запускаются два потока. Первый поток находит максимум в массиве, второй — минимум.
        // Результаты вычислений возвращаются в метод main()

        int[] array = new int[400000];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(50);

        }
        MyTreadMax myTreadMax = new MyTreadMax(array);
        myTreadMax.start();

        MyTreadMin myTreadMin = new MyTreadMin();
        myTreadMin.start();

        System.out.println(myTreadMax.findMax() + " is max\n" + myTreadMin.run(array) + " is min");
    }

}
