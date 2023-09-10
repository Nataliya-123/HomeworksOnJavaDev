package Homework.Homework9;

import java.util.HashMap;
import java.util.Map;

public class NewMethod {

    //Реализовать функцию подсчета количества разных символов в строке - public Map<Character, Integer> getCharsCount(String s)
//     Пример: строка “baaccc” и результат: ‘b’ -1, ‘a’ - 2, ‘c’ - 3
    public Map<Character, Integer> getCharsCount(String string) {
        char[] myChar = string.toCharArray();
        System.out.println(myChar);
        Map<Character, Integer> frequency = new HashMap<>();
        for (char ch : myChar) {
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }
        return frequency;
    }
}