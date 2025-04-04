package ru.job4j.tracker.collection;

import java.util.Comparator;

public class DepartmentsDescComparator implements Comparator<String> {
    @Override
    public int compare(String left, String right) {

        String[] o1 = left.split("/");
        String[] o2 = right.split("/");
        int result = o2[0].compareTo(o1[0]);
        if (result == 0) {
            return left.compareTo(right);
        }
        return result;
    }
}
