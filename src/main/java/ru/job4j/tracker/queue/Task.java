package ru.job4j.tracker.queue;

public record Task(Position position,
                   String description,
                   int urgency) {
}