package ru.job4j.tracker.oop;

public class PizzaExtraCheese extends Pizza {

    @Override
    public String name() {
        return super.name() + " + " + "extra cheese";
    }
}
