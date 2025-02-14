package ru.job4j.tracker.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return x - y;
    }

    public int divide(int y) {
        return y / x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int sumAllOperation(int i) {
        return Calculator.sum(i) + multiply(i) + Calculator.minus(i) + divide(i);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(Calculator.sum(3));
        System.out.println(Calculator.minus(4));
        System.out.println(calculator.divide(5));
        System.out.println(calculator.multiply(6));
        System.out.println(calculator.sumAllOperation(2));
    }
}
