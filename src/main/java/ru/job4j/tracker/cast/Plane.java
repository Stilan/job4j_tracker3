package ru.job4j.tracker.cast;

public class Plane implements Vehicle {

    @Override
    public void move() {
        System.out.println("Лечу в небе");
    }
}
