package Homework;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class HomeWork8 {
    public static void main(String[] args) {

        //1. Введите строку. Если она начинается на 'abc', то заменить их на 'www', иначе добавить в конец строки 'zzz'
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scanner.nextLine();

        if (str.startsWith("abc")) {
            str = str.replace("abc", "www");
        } else {
            str += " zzz";
        }
        System.out.println("Преобразованная строка теперь такая: " + str);


        //2/ Вводится ненормированная строка, у которой могут быть пробелы в начале, в конце и между словами более одного пробела.
        //Привести ее к нормированному виду, т.е. удалить все пробелы в начале и конце, а между словами оставить только один пробел.

        String myString = " Hello everyone  how   are       you? ";
        while (myString.contains("  ")) {
            myString = myString.replace("  ", " ");
            myString = myString.trim();
        }
        System.out.println("Строка с удалёнными пробелами теперь такая: " + myString);


        //3.1 Введите строку (текст). Найдите наибольшее количество идущих подряд цифр.

        String text = "11111. 222sdfg ertwert 5555555 sdfgsdf 252345 wertwetw erwrtw 33333wertewtw.";
        Pattern pattern = Pattern.compile("[^0-9]{1,}");
        Matcher matcher = pattern.matcher(text);
        String res = matcher.replaceAll(" ");
        String[] words = res.split(" ");
        String newString = "";
        for (String word : words) {
            if (word.length() > newString.length()) {
                newString = word;
            }
        }
        System.out.println("Максимальное число это: " + newString);


        //3.2 Поменяйте местами первое самое длинное слово с последним самым коротким

        Scanner scannerr = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String s = scannerr.nextLine();
        String[] mas = s.split(" ");

        int maxLengthArray = mas[0].length();
        int minLengthArray = mas[0].length();
        String max = mas[0];
        String min = mas[0];
        int indexMax = 0, indexMin = 0;
        for (int i = 0; i <= mas.length - 1; i++) {
            if (mas[i].length() > maxLengthArray) {
                maxLengthArray = mas[i].length();
                max = mas[i];
                indexMax = i;
            } else if (mas[i].length() < minLengthArray) {
                minLengthArray = mas[i].length();
                indexMin = i;
                min = mas[i];
            }
        }
        mas[indexMax] = min;
        mas[indexMin] = max;
        System.out.println(Arrays.toString(new String[]{"Массив с изменёнными местами словами: " + Arrays.toString(mas)}));


        //3.3 Найти в строке все знаки препинания. Подсчитать общее количество их.

        char[] c = {'.', ',', '-', ':', ';', '?', '!'};
        int count = 0;// счетчик

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String stringNew = sc.nextLine();

        char[] ch = stringNew.toCharArray();
        for (char value : ch) {
            for (char item : c) {
                if (value == item) {
                    count++;
                }
            }
        }
        System.out.println("Количество знаков препинания в строке: " + count);


        //    4.Общий вид — логин@поддомен.домен.
        //     Логин, как и поддомен — слова из букв, цифр, подчеркиваний, дефисов и точек.
        //     А домен (имеется в виду 1го уровня) — это от 2 до 6 букв и точек.
        //     Пример: myemail@gmail.com  a.petrov@gmail.com.au coder4575@yandex.ru

        String emailStr = "a.petrov@gmail.com.au.f";
        Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[a-zA-Z0-9_+-]+(\\.[a-zA-Z0-9_+-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z\\.]{2,6}$");
        Matcher emailMatcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        if (emailMatcher.find()) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect");
        }


        //     5.RegEx. IP адрес.
        //     4 группы цифр (от 1 до 3 цифр в каждой) разделены точками. Группа содержит число в диапазоне от 1 до 255
        //     Пример: 127.0.0.1  255.255.255.253   100.99.44.2

        String IPAdress = "100.99.44.2";
        Pattern VALID_IP_ADDRESS_REGEX = Pattern.compile("^\\b(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\b{1,3}+\\.+(\\b(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\b{1,3})+\\." +
                "(\\b(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\b{1,3})\\.+(\\b(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\b{1,3})$");
        Matcher matcherforIp = VALID_IP_ADDRESS_REGEX.matcher(IPAdress);
        if (matcherforIp.find()) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect");
        }
    }
}







