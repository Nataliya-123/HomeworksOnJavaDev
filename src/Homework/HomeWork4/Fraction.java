package Homework.HomeWork4;

public class Fraction {
    //Создайте класс с именем fraction, содержащий два поля типа int - числитель и знаменатель обыкновенной дроби.
    //Конструктор класса должен инициализировать их заданным набором значений.
    //Создайте метод класса, который будет выводить дробь в текстовую строку в формате x / y;
    //метод, добавляющий (сложение) к текущей дроби дробь, переданную ему в параметре и возвращающий дробь - результат сложения;
    //метод, умножающий (произведение) текущую дробь на число типа double, переданное ему в параметре и возвращающий дробь - результат умножения;
    //метод, делящий (деление) текущую дробь на число типа double, переданное ему в параметре и возвращающий дробь - результат деления.

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void getFraction() {
        System.out.println("Fraction is: " + numerator + "/" + denominator);
    }

    public void addingFractionToNumber(double number) {
        System.out.println("Result of addition is: "+(double) numerator / denominator + number);

    }
    public void multFructionToNumber(double numberToMultiply){
        System.out.println("Result of multiplication is: "+ (double) numerator / denominator * numberToMultiply);
    }

    public void dividingFructionToNumber(double numberToDivide){
        System.out.println("Result of multiplication is: "+ (double) numerator / denominator/numberToDivide);
    }
}
