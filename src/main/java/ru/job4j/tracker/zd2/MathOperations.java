package ru.job4j.tracker.zd2;

public class MathOperations {
   private Icalculator icalculator;

    public int calculate(int a, int b) {
        icalculator = new SimpleCalculator();
        return icalculator.add(a, b) + icalculator.multiply(a, b);
    }
}
