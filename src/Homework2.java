import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
//        //Необходимо вывести на консоль такую последовательность чисел:
        //     1 2 4 8 16 32 64 128 256 512
        int a = 1;
        while (a <= 512) {
            System.out.print(a + " ");
            a *= 2;
        }
        System.out.println();

        System.out.println("_________________________");


//      //Найдите сумму и произведение цифр числа, введенного с клавиатуры
        System.out.println("Введите неоднозначное число");
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int sum = 0;
        int mult = 1;

        while (b != 0) {
            sum += (b % 10);//получили последнюю цифру, увеличили sum на эту цифру
            mult *= (b % 10);
            b /= 10;//отрезали последнюю цифру
        }

        System.out.println("sum of numbers is: " + sum);
        System.out.println("sum of numbers is: " + mult);

        System.out.println();

        System.out.println("_________________________");


//        //Найдите самую большую цифру числа, введенного с клавиатуры, а также ее индекс
        System.out.println("Введите число");
        int d = scanner.nextInt();
        int maxNumber = 0;
        while (d > 0) {
            if (d % 10 > maxNumber) {
                maxNumber = d % 10;

            }

            d /= 10;
        }
        System.out.println("Max: " + maxNumber);
        System.out.println();
        System.out.println("_________________________");


//        Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры
        System.out.println("Введите число");
        int f = scanner.nextInt();
        int res = 1;
        for (int i = 1; i <= f; i++) {
            res = res * i;
        }
        System.out.println(res);
        System.out.println();
        System.out.println("_________________________");

//Выведите на экран первые 10 членов последовательности Фибоначчи
        int n = 10;
        int g = 0, j = 1;
        System.out.print(n + " " + j);
        int fib = 2, i = 2;
        while (i < n) {
            fib = g + j;
            g = j;
            j = fib;
            System.out.print(" " + fib);
            i++;
        }
        System.out.println();
        System.out.println("_________________________");

//        В американской армии считается несчастливым число 13, а в японской — 4.
//        Перед международными учениями штаб российской армии решил исключить номера боевой техники,
//        содержащие числа 4 или 13 (например, 40123, 13313, 12345 или 13040),
//        чтобы не смущать иностранных коллег. Если в распоряжении армии имеется 100 тыс.
//        единиц боевой техники и каждая боевая машина имеет номер от 00001 до 99999,
//        то сколько всего номеров придётся исключить?

        int nn, jj;
        jj = 0;
        for (int ii = 1; ii < 100000; ii++) {
            nn = ii;
            while (nn != 0) {
                if (nn % 10 == 4 || nn % 100 + 10 * nn % 10 == 13) {
                    jj++;
                    break;
                }
                nn = nn / 10;
            }
        }
        System.out.println("Удалить номеров: " + jj);
        System.out.println();
        System.out.println("_________________________");

//        В городе N проезд в трамвае осуществляется по бумажным отрывным билетам.
//        Каждую неделю трамвайное депо заказывает в местной типографии рулон билетов с
//        номерами от 000001 до 999999. «Счастливым» считается билетик у которого сумма
//        первых трёх цифр номера равна сумме последних трёх цифр, как, например, в билетах
//        с номерами 003102 или 567576. Трамвайное депо решило подарить сувенир обладателю
//        каждого счастливого билета и теперь раздумывает, как много сувениров потребуется.
//        С помощью программы подсчитайте сколько счастливых билетов в одном рулоне?

        int c = -1;
        for (int x1 = 0; x1 < 10; x1++)
            for (int x2 = 0; x2 < 10; x2++)
                for (int x3 = 0; x3 < 10; x3++)
                    for (int x4 = 0; x4 < 10; x4++)
                        for (int x5 = 0; x5 < 10; x5++)
                            for (int x6 = 0; x6 < 10; x6++)
                                if (x1 + x2 + x3 == x4 + x5 + x6) {
                                    c++;
                                }
        System.out.print(c);
        System.out.println();
        System.out.println("_________________________");


//В городе N есть большой склад на котором существует 50000 различных полок.
// Для удобства работников руководство склада решило заказать для каждой полки табличку с номером
// от 00001 до 50000 в местной типографии, но когда таблички напечатали, оказалось что печатный станок
// из-за неисправности не печатал цифру 2, поэтому все таблички, в номерах которых содержалась одна или
// более двойка (например, 00002 или 20202) — надо перепечатывать. Напишите программу, которая подсчитает
// сколько всего таких ошибочных табличек оказалось в бракованной партии.
        int counter = 0;
        for (int p = 1; p <= 50000; p++) {
            if ((p % 10 == 2) || (p / 10 % 10 == 2) || (p / 100 % 10 == 2) ||
                    (p / 1000 % 10 == 2) || (p / 10000 == 2))
                counter++;
        }
        System.out.println(counter);


//        Для введенного целого числа определить является ли это число простым
        System.out.println("Введите число");
        int z = scanner.nextInt();
        for (int l = 2; l < z; l++) {
            if (z % l == 0) {
                System.out.println("Number is not simple");
                break;
            } else {
                System.out.println("Number is simple");
                break;
            }
        }
        System.out.println();
        System.out.println("_________________________");

//        Электронные часы показывают время в формате от 00:00 до 23:59. Подсчитать сколько раз за сутки случается так,
//        что слева от двоеточия показывается симметричная комбинация для той, что справа от двоеточия
//        (например, 02:20, 11:11 или 15:51)
        int counter1 = 0;

        for (int hour = 1; hour <= 24; hour++) {
            for (int minute = 0; minute <= 59; minute++) {

                if (hour % 10 == minute / 10 && hour / 10 == minute % 10) {
                    counter1++;
                }
            }
        }
        System.out.println("Всего " + counter1 + " совпадений");
    }
}

