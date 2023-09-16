package Homework.HW10.pair;

public class Main {
    public static void main(String[] args) {
        Pair<String> pair= new Pair<>("Hello", "world");
        System.out.println(pair);
        System.out.println(pair.getTwo());
        System.out.println(pair.getOne());

        pair.swap();
        System.out.println(pair);

        pair.replaceFirst("Mother");
        System.out.println(pair);

        pair.replaceSecond("buy");
        System.out.println(pair);

    }
}
