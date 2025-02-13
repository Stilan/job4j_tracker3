package ru.job4j.tracker.oop;

public class Hare {
    /**
     *  Метод, в котором заяйц пытается съесть колобк
     * @param ball колобок
     */
    public void tryEat(Ball ball) {
        ball.tryRun(false);
    }
}
