package Homework.threadRunnable.task2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class SaveAsThread implements Runnable {

    private int[] array;
    private String filename;
    private String threadName;
    private Thread thread;

    public SaveAsThread(int[] array, String filename, String threadName) {
        this.array = array;

        this.filename = filename;

        this.threadName = threadName;

        thread = new Thread(this, "SaveThread");
    }


    @Override
    public void run() {
        System.out.println("Begin thread: " + threadName);

        try {
            FileOutputStream fOut = new FileOutputStream(filename);

            PrintStream pS = new PrintStream(fOut);

            pS.println(array.length);
            for (int i = 0; i < array.length; i++) {
                pS.println(array[i]);
            }
            pS.close();
            fOut.close();
        } catch (IOException e) {
                        System.out.println("Error: " + e.getMessage());
        }
        System.out.println("End thread: " + threadName);

    }
}
