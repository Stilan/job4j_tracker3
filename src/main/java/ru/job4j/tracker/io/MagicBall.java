package ru.job4j.tracker.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        Scanner scanner = new Scanner(System.in);
        String question = scanner.nextLine();
        int answer = new Random().nextInt(3);
        System.out.println(answer > 0 ? (answer > 1 ? "Может быть" : "Нет") : "Да");
    }
}
