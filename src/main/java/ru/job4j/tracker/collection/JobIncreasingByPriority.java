package ru.job4j.tracker.collection;

import java.util.Comparator;

public class JobIncreasingByPriority implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return Integer.compare(o1.getPriority(), o2.getPriority());
    }
}
