package Homework.pull_stream;

import java.util.concurrent.Callable;

public class ActionWithRows implements Callable<Integer> {

    int[][] twoDimArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };

    int[] products = new int[twoDimArray.length];
    int[] sums = new int[twoDimArray.length];

    int sum = 0;
    int mult = 0;

    public ActionWithRows(int[][] twoDimArray) {
    }

    @Override
    public Integer call() throws Exception {

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                products[i] *= twoDimArray[i][j];
                sums[i] += twoDimArray[i][j];

                for (int a = 0; a < sums.length; a++) {
                    sum += sums[a];
                }

                for (int b = 0; b < products.length; b++) {
                    mult *= products[b];
                }
            }
        }
        return Math.max(sum, mult);
    }
}