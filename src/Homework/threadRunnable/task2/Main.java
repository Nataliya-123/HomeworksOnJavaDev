package Homework.threadRunnable.task2;

public class Main {
    public static void main(String[] args) {
        //2. Заданы три целочисленных массива.
        // Записать эти массивы в файл (общий) в параллельных потоках. Создать класс SaveAsThread для представления
        // потока, который записывает целочисленный массив в файл. Доступ к файлу должен быть синхронизирован чтобы
        // массивы не перемешались.

        int[] firstArray = { 2, 4, 3, 8, 9, 11, 7 };
        int[] secondArray = { 1, 8, 7, 6, 3 };
        int[] thirdArray = { 7, 7, 9, 9, 4, 2 };

        SaveAsThread thread1 = new SaveAsThread(firstArray, "first.txt", "thread1");
        SaveAsThread thread2 = new SaveAsThread(secondArray, "secondArray.txt", "thread2");
        SaveAsThread thread3 = new SaveAsThread(thirdArray, "thirdArray.txt", "thread3");

        thread1.run();
        thread2.run();
        thread3.run();
    }
}
