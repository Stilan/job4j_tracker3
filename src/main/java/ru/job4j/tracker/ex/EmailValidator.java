package ru.job4j.tracker.ex;

public class EmailValidator {

    public boolean validate(String email) {
        if (!email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("No contains format string");
        }
        return true;
    }
}
