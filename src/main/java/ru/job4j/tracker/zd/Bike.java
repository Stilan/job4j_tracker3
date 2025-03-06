package ru.job4j.tracker.zd;

public class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Мотоцикал поехал ");
    }

    @Override
    public void stop() {
        System.out.println("Мотоцикал остоновился ");
    }
}
