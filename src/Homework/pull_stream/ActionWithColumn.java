package Homework.pull_stream;

import java.util.Arrays;
import java.util.concurrent.Callable;

public class ActionWithColumn implements Callable<Integer> {

    int[][] twoDimArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };

    int[] products = new int[twoDimArray[0].length];
    int[] sums = new int[twoDimArray[0].length];

    int sum = 0;
    int mult = 0;

    public ActionWithColumn(int[][] twoDimArray) {
    }

    @Override
    public Integer call() throws Exception {
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                products[j] *= twoDimArray[i][j];
                sums[j] += twoDimArray[i][j];

                for (int a = 0; a < sums.length; a++) {
                    sum += sums[i];
                }
                for (int b = 0; b < products.length; b++) {
                    mult *= products[b];
                }
            }
        }
        return Math.max(sum, mult);
    }
}