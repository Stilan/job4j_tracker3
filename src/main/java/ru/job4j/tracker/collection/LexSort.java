package ru.job4j.tracker.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        // Разбиваем строки по точке и пробелу.
        String[] leftArray = left.split("\\. ");
        String[] rightArray = right.split("\\. ");
        try {
            int a = Integer.parseInt(leftArray[0]);
            int b = Integer.parseInt(rightArray[0]);
            return Integer.compare(a, b);
        } catch (NumberFormatException nfe) {
            // Если формат строки не соответствует ожидаемому, можно вернуть 0
            return 0;
        }
    }
}
