package ru.job4j.tracker.cast;

public class Train implements Vehicle {

    @Override
    public void move() {
        System.out.println("Еду по рельсам");
    }
}
