package ru.job4j.tracker.collection;

import java.util.ArrayList;
import java.util.List;

public class ConvertList {
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> result = new ArrayList<>();
        /* for-each */
        for (int[] arrays : list) {
            for (int i : arrays) {
                result.add(i);
            }
        }
        return result;
    }
}
