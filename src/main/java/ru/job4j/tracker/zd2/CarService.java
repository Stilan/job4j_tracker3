package ru.job4j.tracker.zd2;

public class CarService implements TransportService {
    @Override
    public void move(Transport transport) {
        System.out.println("Машина едет по дороге");
    }
}
