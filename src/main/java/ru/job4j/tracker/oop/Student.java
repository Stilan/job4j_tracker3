package ru.job4j.tracker.oop;

public class Student {
    /**
     * метод игра на бояне
     */
    public void music() {
        System.out.println("Tra tra tra");
    }

    /**
     * метод спеть
     */
    public void sing() {
        System.out.println("I believe I can fly");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();
        petya.music();
        petya.music();
        petya.sing();
        petya.sing();
        petya.sing();
        System.out.println("Петя три раза сыграл на баяне и три раза спел.");
    }
}
