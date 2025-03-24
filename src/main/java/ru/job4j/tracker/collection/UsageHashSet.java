package ru.job4j.tracker.collection;

import java.util.HashSet;

public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<String> autos = new HashSet<>();
        autos.add("LADA");
        autos.add("BMW");
        autos.add("Volvo");
        autos.add("Toyota");
        for (String str : autos) {
            System.out.println(str);
        }
    }
}
