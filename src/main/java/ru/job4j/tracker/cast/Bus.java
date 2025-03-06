package ru.job4j.tracker.cast;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Еду по дороге");
    }
}
