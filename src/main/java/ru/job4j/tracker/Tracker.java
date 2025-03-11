package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;
    private static int accessCount = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        accessCount++;
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        accessCount++;
        return index != -1 ? items[index] : null;
    }

    public Item[] findAll() {
        Item[] result = new Item[items.length];
        int total = 0;
        for (int i = 0; i < size; i++) {
            if (items[i] != null) {
                result[total] = items[i];
                total++;
            }
        }
        result = Arrays.copyOf(result, total);
        accessCount++;
        return result;
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[items.length];
        int total = 0;
        for (int i = 0; i < size; i++) {
            if (items[i] != null && items[i].getName().equals(key)) {
                result[total] = items[i];
                total++;
            }
        }
        result = Arrays.copyOf(result, total);
        accessCount++;
        return result;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        if (index != -1) {
            item.setId(id);
            items[index] = item;
            return true;
        }
        return false;
    }

    public void delete(int id) {
        int index = indexOf(id);
        if (index != -1) {
            System.arraycopy(items, index + 1, items, index, size - index - 1);
            items[size - 1] = null;
            size--;
        }
        accessCount++;
    }

    private int indexOf(int id) {
        int result = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                result = index;
                break;
            }
        }
        accessCount++;
        return result;
    }

    public int getAccessCount() {
        return accessCount;
    }

}