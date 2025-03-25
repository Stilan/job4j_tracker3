package ru.job4j.tracker.collection;

import java.util.HashSet;

public class UniqueText {
    public boolean isEquals(String originText, String duplicateText) {
        boolean result = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        /* for-each origin -> new HashSet. */
        for (String str : origin) {
            check.add(str);
        }
        for (String str : text) {
            if (!check.contains(str)) {
                result = false;
            }
        }
        /* for-each text -> hashSet.contains */
        return result;
    }
}
