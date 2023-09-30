package Homework.threadRunnable.task3;

import java.util.List;
import java.util.Random;

public class Generator extends Thread{
    List<Integer> myList;

    public Generator(List<Integer> myList) {
        this.myList = myList;
    }

    public void run(){
        while (myList.size()<=100){
            myList.add(new Random().nextInt(100));
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
