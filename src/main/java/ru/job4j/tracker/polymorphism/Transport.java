package ru.job4j.tracker.polymorphism;

public interface Transport {
    void move();

    void passengers(int count);

    int refuel(int fuel);
}
