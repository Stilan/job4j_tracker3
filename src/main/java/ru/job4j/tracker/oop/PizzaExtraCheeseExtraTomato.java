package ru.job4j.tracker.oop;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {
    @Override
    public String name() {
        return super.name() + " + " + "extra tomato";
    }
}
