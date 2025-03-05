package ru.job4j.tracker.polymorphism;

public class Bus implements Transport {

    private int passenger;

    @Override
    public void move() {
        System.out.println("Автобус движется");
    }

    @Override
    public void passengers(int count) {
        passenger = count;
    }

    @Override
    public int refuel(int fuel) {
        return fuel * 31;
    }
}
