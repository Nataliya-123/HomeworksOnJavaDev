package Homework.publictransport;

public  class Taxi extends PublicTransport{

    private String model;

    public Taxi(int priceOfTransport, int fuelConsumption, String model) {
        super(priceOfTransport, fuelConsumption);
        this.model = model;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                ", fuelConsumption=" + getFuelConsumption() +
                '}';
    }
}
