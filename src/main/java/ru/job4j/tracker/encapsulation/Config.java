package ru.job4j.tracker.encapsulation;

public class Config {
    private String name;
    private int position;
    private String[] properties;

    public Config(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(position);
    }

    public String getProperty(String key) {
        return search(key);
    }

    /**
     * Я оставил этот метод private он вызвается в нутри класса
     */
    private String search(String key) {
        return key;
    }
}
