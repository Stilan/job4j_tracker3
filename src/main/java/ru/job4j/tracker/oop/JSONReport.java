package ru.job4j.tracker.oop;

public class JSONReport extends TextReport {
    @Override
    public String generate(String name, String body) {
        String ln = System.lineSeparator();
        String expected = "{" + ln
                + "\t\"name\" : " + String.format("\"%s\"", name) + "," + ln
                + "\t\"body\" : " + String.format("\"%s\"", body) + ln
                + "}";
        return expected;
    }
}
