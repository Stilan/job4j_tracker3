package ru.job4j.tracker.zd2;

public class TransportFactory {

    public static TransportService getService(Transport transport) {
        if (transport instanceof Car) {
            return new CarService();
        } else {
            return new BikeService();
        }
    }
}
