package ru.job4j.tracker.zd;

public class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Мяу мяу");
    }

    @Override
    public void eat(String food) {
        System.out.println("Я ем " + food);
    }
}
