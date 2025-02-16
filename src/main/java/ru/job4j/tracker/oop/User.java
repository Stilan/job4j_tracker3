package ru.job4j.tracker.oop;

public class User {
    private String name; // это поля объекта обявлена вне методов доступна через конструктор и сеторы и геторы
    private int age; // это поля объекта обявлена вне методов доступна через конструктор и сеторы и геторы

    public boolean canDrive() {
        boolean can = false; // это локальная переменая она обявлена внутри метода
        if (age >= 18) {
            can = true;
        }
        return can;
    }
}
