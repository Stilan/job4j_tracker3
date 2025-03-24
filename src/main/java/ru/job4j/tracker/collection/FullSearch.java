package ru.job4j.tracker.collection;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FullSearch {
    public Set<String> extractNumber(List<Task> tasks) {
        Set<String> setTasks = new HashSet<>();
        for (Task task : tasks) {
            setTasks.add(task.getNumber());
        }
        return setTasks;
    }
}
