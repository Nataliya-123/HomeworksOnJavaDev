package Homework.HomeWork4;

public class MainPhones {
    public static void main(String[] args) {
        Phones phones = new Phones(12, "Apple iPhone 12", 164);
        Phones phones1 = new Phones(14, "Apple iPhone 14", 172);
        Phones phones2 = new Phones(14, "Apple iPhone 14", 204);
        System.out.println(phones);
        System.out.println(phones1);
        System.out.println(phones2);

        phones.receiveCall("Петя");
        phones1.receiveCall("Миша");
        phones2.receiveCall("Ваня");

        System.out.println(phones.getNumber());
        System.out.println(phones1.getNumber());
        System.out.println(phones2.getNumber());

        phones.receiveCall("Петя", "+375295678734");
        phones1.receiveCall("Миша", "+375295678734");
        phones2.receiveCall("Ваня", "+375295678736");

        phones.sendMessage("+375295678734", "+375295678734", "+375295678736");
        phones1.sendMessage("+375295678734", "+375295678734", "+375295678736");
        phones2.sendMessage("+375295678734", "+375295678734", "+375295678736");
    }
}