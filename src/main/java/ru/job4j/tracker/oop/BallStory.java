package ru.job4j.tracker.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Fox fox = new Fox();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        hare.tryEat(ball);
        System.out.println("———————");
        wolf.tryEat(ball);
        System.out.println("———————");
        fox.tryEat(ball);
    }
}
