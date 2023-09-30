package Homework.homeWorkFiles;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //Даны 2 файла - in1.txt и in2.txt в каждом файле по 1000 чисел от 1 до 100000.
        // Создайте файл out.txt, который будет содержать все отсортированные числа из файлов
        // in1.txt и in2.txt. Файлы in1.txt и in2.txt можно создать с помощью кода.



//записала первый файл
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("in1.txt");
            for (int i = 0; i < 10; i++) {
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
//записала второй файл
        try {
            fileWriter = new FileWriter("in2.txt");
            for (int i = 0; i < 10; i++) {
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

//прочитала первый файл и вывела в лист
        List<String> list = new ArrayList<>();
        try (BufferedReader br = Files.newBufferedReader(Paths.get("in1.txt"))) {
            String str;
            list = br.lines().collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }
        list.forEach(System.out::println);


//прочитала второй файл и вывела в лист
        List<String> list2 = new ArrayList<>();
        try (BufferedReader br = Files.newBufferedReader(Paths.get("in2.txt"))) {
            String str1;
            list2 = br.lines().collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }
        list2.forEach(System.out::println);

        System.out.println("__________________________");

  //создала новый общий лист из двух предыдущих листов
        List<String>commonList = new ArrayList<>();
        commonList.addAll(list);
        commonList.addAll(list2);
        System.out.println(commonList);

        System.out.println("_______________________");

//перевела общий лист в целочисленный и отсортировала
        List<Integer> newCommonList = commonList.stream().map(Integer::parseInt).sorted().collect(Collectors.toList());
        newCommonList.forEach(System.out::println);

//записала его в файл
        try {
            fileWriter = new FileWriter("out.txt");
           fileWriter.write(String.valueOf(newCommonList));
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
//прочитала его из файла
        List<String> commonList2 = new ArrayList<>();
        try (BufferedReader br = Files.newBufferedReader(Paths.get("out.txt"))) {

            commonList2 = br.lines().collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }
        commonList2.forEach(System.out::println);
    }
}