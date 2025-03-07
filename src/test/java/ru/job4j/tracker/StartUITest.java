package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StartUITest {
    @Test
    void whenAddItem() {
        String[] answers = {"Fix PC", "111"};
        Input input = new MockInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        StartUI.createItem(input, tracker);

        assertThat(tracker.findAll()[0].getName()).isEqualTo("Fix PC");
        assertThat(tracker.findAll()[1].getName()).isEqualTo("111");
    }
    @Test
    void  whenAddItem2() {
        String[] answers = {"test"};
        Input input = new MockInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("test");
        assertThat(created.getName()).isEqualTo(expected.getName());
    }
}