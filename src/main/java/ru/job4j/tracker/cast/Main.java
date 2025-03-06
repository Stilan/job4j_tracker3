package ru.job4j.tracker.cast;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Train train = new Train();
        Plane plane = new Plane();
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = bus;
        vehicles[1] = train;
        vehicles[2] = plane;
        for (Vehicle v : vehicles) {
            v.move();
        }
    }
}
