package Homework.publictransport;

public class Main {
    public static void main(String[] args) {


        PublicTransportPark publicTransportPark = new PublicTransportPark("Park #10");
        Bus bus = new Bus(2000, 15, 10);
        Bus bus1 = new Bus(1000, 7, 15);
        Bus bus2 = new Bus(2500, 10, 7);

        Trolleybus trolleybus = new Trolleybus(3000, 10, 16);
        Trolleybus trolleybus1 = new Trolleybus(3000, 14, 16);
        Trolleybus trolleybus2 = new Trolleybus(3000, 18, 16);

        Taxi taxi = new Taxi(10000, 7, "BMW");
        Taxi taxi1 = new Taxi(10000, 8, "Skoda");
        Taxi taxi2 = new Taxi(10000, 9, "Skoda");

        publicTransportPark.addBus(bus);
        publicTransportPark.addBus(bus1);
        publicTransportPark.addBus(bus2);


        publicTransportPark.addTrolleybus(trolleybus);
        publicTransportPark.addTrolleybus(trolleybus1);
        publicTransportPark.addTrolleybus(trolleybus2);

        publicTransportPark.addTaxi(taxi);
        publicTransportPark.addTaxi(taxi1);
        publicTransportPark.addTaxi(taxi2);



        System.out.println("Total cost of transport is " + publicTransportPark.calculateCostOfPark());


        publicTransportPark.sortBusByFuelConsumption();
        publicTransportPark.printBus();

        publicTransportPark.sortTrolleyBusByFuelConsumption();
        publicTransportPark.printTrolleybus();

        publicTransportPark.sortTaxiByFuelConsumption();
        publicTransportPark.printTaxi();
    }
}
