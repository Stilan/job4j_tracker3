package ru.job4j.tracker.oop;

public class Ball {
    /**
     * метод колобок убежал или нет
     * @param condition переменая указывает сели или нет колобка
     */
    public void tryRun(boolean condition) {
        if (!condition) {
            System.out.println("Колобок сбежал!");
        } else {
            System.out.println("Колобка съели...");
        }
    }
}
