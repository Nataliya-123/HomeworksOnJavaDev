package Homework.publictransport;

public class Bus extends PublicTransport {

    private int numberOfStopsOnTheRoute;

    public Bus(int priceOfTransport, int fuelConsumption, int numberOfStopsOnTheRoute) {
        super(priceOfTransport, fuelConsumption);
        this.numberOfStopsOnTheRoute = numberOfStopsOnTheRoute;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "id=" + getId() +
                ", fuelConsumption=" + getFuelConsumption() +
               '}';
    }
}