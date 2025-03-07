package ru.job4j.tracker.zd2;

public class BikeService implements TransportService {
    @Override
    public void move(Transport transport) {
        System.out.println("Велосипед движется по велодорожке");
    }

}
