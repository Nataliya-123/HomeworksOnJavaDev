package Homework;

import java.util.Arrays;

public class Homwork3 {
    public static void main(String[] args) {
        //1. Разложить положительные и отрицательные числа по разным массивам
        int[] array = {5, -2, 4, 10, -22, 35, -14, 45};
        int quantytyOfPos = 0;
        int quantyOfNeg = 0;
        for (int x : array) {
            if (x > 0) {
                quantytyOfPos++;
            } else {
                quantyOfNeg++;
            }
        }

        int[] arrpositive = new int[quantytyOfPos];
        int[] arrnegative = new int[quantyOfNeg];

        int countpos = 0;
        int countneg = 0;
        for (int x : array) {
            if (x > 0) {
                arrpositive[countpos] = x;
                countpos++;
            } else {
                arrnegative[countneg] = x;
                countneg++;
            }
        }

        System.out.println("Массив с отрицательными числами: ");
        System.out.println(java.util.Arrays.toString(arrnegative));
        System.out.println("Массив с положительными числами: ");
        System.out.println(java.util.Arrays.toString(arrpositive));

        //2. Исключить одинаковые элементы массива (каждое значение должно присутствовать в единственном экземпляре)
        //отсортировать массив, сравнить числа одни за другими, если нашли дубликат dublicatesCount++. нашли сколько
//       дубликатов,  - теперь значем какой размер массива надо
        int[] array1 = {5, 6, 5, 4, 8, 4, -22, 35, -14, 45};
        int quantytyOfNewMass;
        int dublicatesCount = 0;
        int b;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array1.length - 1; i++) {

                if (array1[i] > array1[i + 1]) {
                    b = array1[i];
                    array1[i] = array1[i + 1];
                    array1[i + 1] = b;
                    isSorted = false;
                }
            }
        }
        System.out.println(java.util.Arrays.toString(array1));
        for (int i = 0; i < array1.length - 1; i++) {
            if (array1[i] == array1[i + 1]) {
                dublicatesCount++;
            }
        }

        quantytyOfNewMass = array1.length - dublicatesCount;

        int[] arrayWithoutDuplicates = new int[quantytyOfNewMass];
        int countAwarray = 0;
        for (int i = 0; i < array1.length - 1; i++) {
            if (array1[i] != array1[i + 1]) {
                arrayWithoutDuplicates[countAwarray] = array1[i];
                countAwarray++;
            }
        }
        System.out.println();
        System.out.println("Массив с уникальными значениями: ");
        System.out.println(java.util.Arrays.toString(arrayWithoutDuplicates));

//Найти строку матрицы с максимальной суммой элементов

        int[][] table = new int[][]{
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 1},
                {1, 2, 3, 4, 7},
                {1, 2, 3, 4, 8},
                {1, 2, 3, 4, 3}};


        int sum1, maxsum = 0, ind = 0;
        for (int i = 0; i < table.length; i++) {
            sum1 = 0;
            for (int j = 0; j < table[i].length; j++) {
                sum1 += table[i][j];
            }
            if (sum1 > maxsum) {
                maxsum = sum1;
                ind = i;
            }
            System.out.println();
        }
        System.out.printf("Максимальная сумма: %d в %d строке", maxsum, ind);

//Сделать транспонирование матрицы (замена строк на столбцы)
        // часть 1 - создаем матрицу n на n
        int n = 3;
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = n * i + j;
            }
        }
        int v = 3;
        int[][] myArray = new int[3][3];
        myArray[0][0] = 5;
        myArray[0][1] = 6;
        myArray[0][2] = 7;
        myArray[1][0] = 8;
        myArray[1][1] = 9;
        myArray[1][2] = 2;
        myArray[2][0] = 1;
        myArray[2][1] = 9;
        myArray[2][2] = 5;

        System.out.println();
        System.out.println("Первоначальный массив");
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                System.out.printf("%4d", myArray[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < v; i++) {
            for (int j = i + 1; j < v; j++) {
                int temp = myArray[i][j];
                myArray[i][j] = myArray[j][i];
                myArray[j][i] = temp;
            }
        }
        System.out.println();
        System.out.println("Перевернутый массив");
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                System.out.printf("%4d", myArray[i][j]);
            }
            System.out.println();
        }

        //Создать массив заполнить его случайными элементами, распечатать, перевернуть, и снова распечатать.
        //  При перевороте элементов не создавать еще один массив

        int f = 8;
        int[] ar = {5, -2, 4, 10, -22, 35, -14, 45};
        System.out.println("Первоначальный массив ");
        for (int i = 0; i < f; i++) {
        }
        System.out.println(java.util.Arrays.toString(ar));
        for (int i = 0; i < f / 2; i++) {
            int j = ar[i];
            ar[i] = ar[f - 1 - i];
            ar[f - 1 - i] = j;
        }
        System.out.println("\n ");
        System.out.println("Перевернутый массив ");
        for (int i = 0; i < f; i++) {
        }
        System.out.println(java.util.Arrays.toString(ar));

        //Выполнить слияние 2 упорядоченных массивов в один упорядоченный массив.
        //  Исходные массивы сортировать не нужно, они даны упорядоченными.
        //  Итоговый массив должен быть упорядоченным сразу после слияния, без
        //  дополнительных сортировок.


        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        int[] arr2 = new int[]{2, 5, 7, 8, 9};
        int[] arr3 = new int[arr.length + arr2.length];
        System.out.println();
        System.out.println("Объеденённый массив:");

        int i = 0, j = 0;
        for (int k = 0; k < arr3.length; k++) {

            if (i > arr.length - 1) {
                int m = arr2[j];
                arr3[k] = m;
                j++;
            } else if (j > arr2.length - 1) {
                int m = arr[i];
                arr3[k] = m;
                i++;
            } else if (arr[i] < arr2[j]) {
                int m = arr[i];
                arr3[k] = m;
                i++;
            } else {
                int l = arr2[j];
                arr3[k] = l;
                j++;
            }
        }
        for (int l = 0; l < arr3.length; l++) {

            System.out.print(arr3[l] + " ");
        }
    }
}



