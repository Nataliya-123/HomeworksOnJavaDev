package Homework.threadRunnable.task1;

public class MyTreadMin extends Thread {
    public int run(int[] array) {
        int min = array[0];
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}
