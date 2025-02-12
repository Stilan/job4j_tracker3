package ru.job4j.tracker.oop;

public class Main {
    public static void main(String[] args) {
        /**
         *  Создаем три объекта класса Dog
         */
        Dog polkan = new Dog();
        polkan.bark();
        Dog sharik = new Dog();
        sharik.bark();
        Dog zhychka = new Dog();
        zhychka.bark();
        System.out.println("Созданы три объекта Dog.");
    }
}
