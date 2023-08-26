package Homework;

import java.util.Random;
import java.util.Scanner;

public class HomeWork1 {

    //Найти среднее число из трех, введенных с клавиатуры
    public static void main(String[] args) {
        System.out.println("Введите три числа");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a - b) * (c - a) >= 0) {
            System.out.print(a);

        } else if ((b - a) * (c - b) >= 0) {
            System.out.print(b);

        } else {
            System.out.print(c);

        }
        System.out.println();
        System.out.println("_________________________");


        //Напишите программу расчета даты следующего дня введя 3 числа - день месяц и год
        //     Пример:
        //     15
        //     3
        //     2000
        //     16 3 2000

        System.out.println("Введите  дату, месяц и год");

        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        int amountOfDayInMonth = 0;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                amountOfDayInMonth = 31;

            case 4:
            case 6:
            case 9:
            case 11:
                amountOfDayInMonth = 30;
            case 2:
                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
                    amountOfDayInMonth = 29;

                } else {
                    amountOfDayInMonth = 28;
                }
        }
        if (day == amountOfDayInMonth && month == 12) {
            year = year + 1;
            day = 1;
            month = 1;
            sc.close();
        }
        else if (day == amountOfDayInMonth && month != 12) {
            day = 1;
            month = month + 1;
            sc.close();
        }
        else   {
            day = day + 1;
        }
        sc.close();
        System.out.println("Дата следующего дня: " + day + " " + month + " " + year);
        System.out.println("_________________________");

//        На некотором предприятии инженер Петров создал устройство, на табло которого показывается количество секунд,
//        оставшихся до конца рабочего дня. Когда рабочий день начинается ровно в 9 часов утра — табло отображает «28800»
//        (т.е. остаётся 8 часов), когда времени 14:30 — на табло «9000» (т.е. остаётся два с половиной часа), а когда наступает
//        17 часов — на табло отображается «0» (т.е. рабочий день закончился).
//        Программист Иванов заметил, как страдают офисные сотрудницы — им неудобно оценивать остаток рабочего дня в секундах.
//        Иванов вызвался помочь сотрудницам и написать программу, которая вместо секунд будет выводить на табло понятные фразы
//        с информацией о том, сколько полных часов осталось до конца рабочего дня. Например: «осталось 7 часов», «осталось 4 часа»,
//        «остался 1 час», «осталось менее часа».
//        Итак, в переменную n должно записываться случайное (на время тестирования программы) целое число из [0;28800],
//        далее оно должно выводиться на экран (для Петрова) и на следующей строке (для сотрудниц) должна выводиться фраза
//        о количестве полных часов, содержащихся в n секундах.
//        Пример:
//        23466
//        Осталось 6 часов

        Random random = new Random();
        int seconds = random.nextInt(28800), hours = seconds / 60 / 60;
        System.out.println("Секунд осталось " + seconds);
        switch (hours) {
            case 0:
                System.out.println("До конца рабочего дня осталось меньше часа");
                break;
            case 1:
                System.out.println("До конца рабочего дня остался " + hours + " час");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("До конца рабочего дня осталось " + hours + " часа");
                break;
            default:
                System.out.println("До конца рабочего дня осталось " + hours + " часов");
        }
    }
}