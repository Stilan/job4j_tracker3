package ru.job4j.tracker.zd;

public class Dog implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Гав гав");
    }

    @Override
    public void eat(String food) {
        System.out.println("Я ем " + food);
    }
}
