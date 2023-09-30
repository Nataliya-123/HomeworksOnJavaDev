package Homework.homeWorkFiles;

import java.io.*;
import java.util.Random;

public class Main2 {
    public static void main(String[] args) throws FileNotFoundException {
        //Записать в двоичный файл 30 случайных чисел от 1 до 100.
        // Прочитать записанный файл распечатать числа и их среднее арифметическое.

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("newFile.txt");
            for (int i = 0; i < 30; i++) {
                fileWriter.write(new Random().nextInt(100) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException ignored) {
                }
            }
        }

        try (BufferedReader br = new BufferedReader(new FileReader("newFile.txt"))) {
            String str;
            int sum = 0;
            int count = 0;
            while ((str = br.readLine()) != null) {
                sum += Integer.parseInt(str);
                count++;
            }
            System.out.println(String.format("%.3f", (double) sum / count));
        } catch (FileNotFoundException e) {
            System.out.println("File \"newFile.txt\" is not found!");
        } catch (IOException e) {
            System.out.println("Unable to read this file!");
        }
    }
}
