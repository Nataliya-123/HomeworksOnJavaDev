package Homework.HomeWork4;

import java.util.Arrays;

public class Phones {

    //    Создайте класс Phone, который содержит поля number, model и weight.
//Создайте три экземпляра (instance) этого класса.
//Выведите в консоль их значения.
//Добавить в класс Phone методы: receiveCall (один параметр – имя звонящего). Выводит на консоль сообщение “Звонит {name}”. getNumber – возвращает  номер телефона. Вызвать эти методы для каждого из объектов
//Добавить второй метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
//Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
    private int number;
    private String model;
    private double ewight;

    public Phones(int number, String model, double ewight) {
        this.number = number;
        this.model = model;
        this.ewight = ewight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String numberOfPhone) {
        System.out.println("Звонит " + name + " его номер " + numberOfPhone);
    }

    public int getNumber() {
        return number;
    }

    public void sendMessage(String... numberPhones) {
        System.out.println("Send messages to: " + Arrays.toString(numberPhones));

    }

    @Override
    public String toString() {
        return "Phones{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", ewight=" + ewight +
                '}';
    }
}