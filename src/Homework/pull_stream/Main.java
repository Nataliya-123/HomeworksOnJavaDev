package Homework.pull_stream;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        //Создайте матрицу размера n*m. Создайте два потока,
        // один из которых перемножает все значения в столбцах и потом находит сумму, а другой поток перемножает все
        // значения в строках и тоже потом находит сумму. Определите какое число больше. Обязательно использовать пулы потоков


        int [][] twoDimArray = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        ExecutorService s = Executors.newFixedThreadPool(2);
        Future<Integer> actionWithColumn = s.submit(new ActionWithColumn(twoDimArray));
        Future<Integer> actionWithRows = s.submit(new ActionWithRows(twoDimArray));

        try {
            System.out.println(actionWithColumn.get());
            System.out.println(actionWithRows.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        s.shutdown();
    }
}
