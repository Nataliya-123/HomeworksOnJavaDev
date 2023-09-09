package Homework.publictransport;

import java.util.Arrays;

public class PublicTransportPark {

    private String name;
    private static final int BUS_QUANTITY = 3;
    private static final int TROLLEYBUS_QUANTITY = 3;
    private static final int TAXI_QUANTITY = 3;
    private Bus[] buses = new Bus[BUS_QUANTITY];
    private Trolleybus[] trolleybuses = new Trolleybus[TROLLEYBUS_QUANTITY];
    private Taxi[] taxis = new Taxi[TAXI_QUANTITY];

    public PublicTransportPark(String name) {
        this.name = name;
    }


    int busCurrentSize = 0;
    int trolleybusCurrentSize = 0;
    int taxiCurrentSize = 0;


    public void sortBusByFuelConsumption() {
        for (int i = 0; i < busCurrentSize - 1; i++) {
            for (int j = 0; j < busCurrentSize - i - 1; j++) {
                if (buses[i].getFuelConsumption() > buses[i + 1]
                        .getFuelConsumption()) {
                    Bus temp = buses[j];
                    buses[j] = buses[j + 1];
                    buses[j + 1] = temp;
                }
            }
        }
    }

    public void sortTrolleyBusByFuelConsumption() {
        for (int i = 0; i < trolleybusCurrentSize - 1; i++) {
            for (int j = 0; j < trolleybusCurrentSize - i - 1; j++) {
                if (trolleybuses[i].getFuelConsumption() > trolleybuses[i + 1]
                        .getFuelConsumption()) {
                    Trolleybus temp = trolleybuses[j];
                    trolleybuses[j] = trolleybuses[j + 1];
                    trolleybuses[j + 1] = temp;
                }
            }
        }
    }


    public void sortTaxiByFuelConsumption() {
        for (int i = 0; i < taxiCurrentSize - 1; i++) {
            for (int j = 0; j < taxiCurrentSize - i - 1; j++) {
                if (buses[i].getFuelConsumption() > taxis[i + 1]
                        .getFuelConsumption()) {
                    Taxi temp = taxis[j];
                    taxis[j] = taxis[j + 1];
                    taxis[j + 1] = temp;
                }
            }
        }
    }


    public int calculateCostOfPark() {
        int costOfPark = 0;

        for (int i = 0; i < BUS_QUANTITY; i++) {
            Bus bus = buses[i];
            if (bus != null) {
                costOfPark += bus.getPriceOfTransport();
            }
        }
        for (int j = 0; j < TAXI_QUANTITY; j++) {
            Trolleybus trolleybus = trolleybuses[j];
            if (trolleybus != null) {
                costOfPark += trolleybus.getPriceOfTransport();
            }
        }
        for (int k = 0; k < TAXI_QUANTITY; k++) {
            Taxi taxi = taxis[k];
            if (taxi != null) {
                costOfPark += taxi.getPriceOfTransport();
            }
        }
        return costOfPark;
    }

    public boolean addBus(Bus bus) {
        if (busCurrentSize < buses.length) {
            buses[busCurrentSize] = bus;
            busCurrentSize++;
            return true;
        } else {
            return false;
        }
    }

    public boolean addTrolleybus(Trolleybus trolleybus) {
        if (trolleybusCurrentSize < trolleybuses.length) {
            trolleybuses[trolleybusCurrentSize] = trolleybus;
            trolleybusCurrentSize++;
            return true;
        }
        return false;
    }

    public boolean addTaxi(Taxi taxi) {
        if (taxiCurrentSize < taxis.length) {
            taxis[taxiCurrentSize] = taxi;
            taxiCurrentSize++;
            return true;
        }
        return false;
    }

    public void printBus() {
        System.out.println(Arrays.toString(buses));
    }
    public void printTaxi() {
        System.out.println(Arrays.toString(trolleybuses));
    }
    public void printTrolleybus() {
        System.out.println(Arrays.toString(taxis));
    }
}
