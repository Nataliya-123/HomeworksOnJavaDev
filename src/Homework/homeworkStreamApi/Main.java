package Homework.homeworkStreamApi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Дана коллекция Collection<Integer> col. С помощью stream API:
        //○ найти минимальное число
        //○ найти максимальное число
        //○ найти среднее арифметическое чисел
        //○ найти произведение всех чисел
        // ○ найти сумму всех чисел
        //○ найти сумму всех цифр

        List<Integer> numbers = Arrays.asList(1, 2, 34, 44, 66);
        Optional<Integer> maxNumbers = numbers.stream().max((x1, x2) -> {
            return x1.compareTo(x2);
        });
        //_______________________________________

        Optional<Integer> minNumbers = numbers.stream().min(Integer::compare);

        maxNumbers.ifPresent(System.out::println);
        minNumbers.ifPresent(System.out::println);
        //_______________________________________

        OptionalDouble averageNumber = numbers.stream().mapToInt(x -> x).average();
        averageNumber.ifPresent(System.out::println);

        //_________________________________________


        Optional<Integer> productOfNumbers = numbers.stream().reduce((x, y) -> x * y);
        productOfNumbers.ifPresent(System.out::println);

        //___________________________________

        Optional<Integer> sumNumbers = numbers.stream().reduce(Integer::sum);
        sumNumbers.ifPresent(System.out::println);

        //
        //Создать список строк List<String> myList = Arrays.asList("a1", "a2", "a3", "b1", "b3", "c2", "c1", "c5");
        //Используя stream и lambda выполнить следующие действия:
        //○ Удалить все содержащие “3”
        //○ Отсортировать сперва по числу (по возрастанию), потом по букве (по убыванию)
        //○ Отбросить первый и последний элемент
        //○ Привести в uppercase
        //○ Выдать на печать результат
        //○ Напечатать количество оставшихся элементов

        //Все действия по отдельности

        List<String> myList = Arrays.asList("a1", "a2", "a3", "b1", "b3", "c2", "c1", "c5");
        List<String> deleteThree = myList.stream().filter(s -> !s.contains("3")).collect(Collectors.toList());

        deleteThree.forEach(s -> System.out.print(s + " "));

        //________________________________

        String lastElement = myList.stream().reduce((x, y) -> y).orElse(null);
        String firstElement = myList.stream().findFirst().get();
        System.out.println("Первый элемент - " + firstElement + ", последний элемент: " + lastElement);

        List<String> deleteFirstAndLastElement = myList.stream().filter((s -> !s.contains(firstElement) && !s.contains(lastElement)))
                .collect(Collectors.toList());
        deleteFirstAndLastElement.forEach(s -> System.out.print(s + " "));
        System.out.println();

        //______________________________________

        Stream<String> convertToUpperCase = myList.stream().map(String::toUpperCase);
        convertToUpperCase.forEach(s -> System.out.print(s + " "));

        //_______________________________________

        Stream<String> sortList = myList.stream().sorted(Comparator.<String, String>comparing(s -> s.split("-")[0])
                .reversed()
                .thenComparingInt(s -> Integer.parseInt(s.split("-")[1])));
        sortList.forEach(System.out::println);

        System.out.println("____________________________");

        //Все действия сразу

        List<String> newList = myList.stream().filter(s -> !s.contains("3"))
                .sorted(Comparator.<String, String>comparing(s -> s.split("-")[0])
                        .reversed()
                        .thenComparingInt(s -> Integer.parseInt(s.split("-")[1])))
                .filter((s -> !s.contains(firstElement) && !s.contains(lastElement)))
                .map(String::toUpperCase).collect(Collectors.toList());
        newList.forEach(System.out::println);
        System.out.println("Количество оставшихся элементов: " + newList.size());
    }
}