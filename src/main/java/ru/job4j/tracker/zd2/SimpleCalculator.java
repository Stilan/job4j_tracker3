package ru.job4j.tracker.zd2;

public class SimpleCalculator implements Icalculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }
}
