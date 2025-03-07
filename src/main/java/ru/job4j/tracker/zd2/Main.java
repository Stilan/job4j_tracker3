package ru.job4j.tracker.zd2;

public class Main {

    public static void main(String[] args) {

        Transport car = new Car();
        Transport bike = new Bike();

        TransportService carService = TransportFactory.getService(car);
        TransportService bikeService = TransportFactory.getService(bike);

        carService.move(car);
        bikeService.move(bike);
    }
}
