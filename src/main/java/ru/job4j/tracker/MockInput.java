package ru.job4j.tracker;

import java.util.Scanner;

public class MockInput implements Input {
    Scanner scanner = new Scanner(System.in);

    @Override
    public String askStr(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }

    @Override
    public int askInt(String question) {
        System.out.println(question);
        return scanner.nextInt();
    }
}
