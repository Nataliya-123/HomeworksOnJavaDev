package Homework.threadRunnable.task1;

public class MyTreadMax extends Thread {
    private final int[] array;

    public MyTreadMax(int[] array) {
        this.array = array;
    }

    public int findMax() {
        int max = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
