package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ItemTest {

    @Test
    public void whenSortingByIncreasingItem() {
        List<Item> list = new ArrayList<>();
        list.add(new Item("Job"));
        list.add(new Item("Go to home"));
        list.add(new Item("Works"));
        assertThat(list.get(0).getName()).isEqualTo("Job");
        assertThat(list.get(1).getName()).isEqualTo("Go to home");
        assertThat(list.get(2).getName()).isEqualTo("Works");
        Collections.sort(list, new ItemAscByName());
        assertThat(list.get(0).getName()).isEqualTo("Go to home");
        assertThat(list.get(1).getName()).isEqualTo("Job");
        assertThat(list.get(2).getName()).isEqualTo("Works");
    }

    @Test
    public void whenSortingByDescendingItem() {
        List<Item> list = new ArrayList<>();
        list.add(new Item("Job"));
        list.add(new Item("Go to home"));
        list.add(new Item("Works"));
        assertThat(list.get(0).getName()).isEqualTo("Job");
        assertThat(list.get(1).getName()).isEqualTo("Go to home");
        assertThat(list.get(2).getName()).isEqualTo("Works");
        Collections.sort(list, new ItemDescByName());
        assertThat(list.get(0).getName()).isEqualTo("Works");
        assertThat(list.get(1).getName()).isEqualTo("Job");
        assertThat(list.get(2).getName()).isEqualTo("Go to home");
    }
}