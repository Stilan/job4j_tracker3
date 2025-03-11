package ru.job4j.tracker;

public class CountItemsAction implements UserAction {
    @Override
    public String name() {
        return "Количество заявок";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Количество заявок ===");
        System.out.println("Всего заявок: " + tracker.getAccessCount());
        return true;
    }
}
