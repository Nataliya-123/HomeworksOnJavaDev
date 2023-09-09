package Homework.publictransport;

public class Trolleybus extends PublicTransport{
    private int numberOfStopsOnTheRoute;

    public Trolleybus(int priceOfTransport, int fuelConsumption, int numberOfStopsOnTheRoute) {
        super(priceOfTransport, fuelConsumption);
        this.numberOfStopsOnTheRoute = numberOfStopsOnTheRoute;
    }

    @Override
    public String toString() {
        return "Trolleybus{" +
        ", fuelConsumption=" + getFuelConsumption() +
                '}';
    }
}
