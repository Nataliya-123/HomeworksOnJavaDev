package Homework.publictransport;

import java.util.Random;

public abstract class PublicTransport {
//Определить иерархию различных видов ОТ.
//Создать парк ОТ.
//Рассчитать стоимость автопарка.
//Провести сортировку машин парка по расходу топлива.
//Найти автобус в компании, соответствующий заданному диапазону параметров.

    private final int id = new Random().nextInt(1000);
    private int priceOfTransport;
    private int fuelConsumption;



    public PublicTransport(int priceOfTransport, int fuelConsumption) {
        this.priceOfTransport = priceOfTransport;
        this.fuelConsumption = fuelConsumption;
    }

    public int getPriceOfTransport() {
        return priceOfTransport;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }


    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "PublicTransport{" +
                "id=" + id +
                ", priceOfTransport=" + priceOfTransport +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }
}
