package ru.job4j.tracker.oop;

public class Programmer extends Engineer {
    private String programLanguage;

    public Programmer(String programLanguage, int experience, boolean degree) {
        super(experience, degree);
        this.programLanguage = programLanguage;

    }
}
