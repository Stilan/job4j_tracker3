package ru.job4j.tracker.collection;

import java.util.HashSet;
import java.util.List;

public class NotifyAccount {
    public static HashSet<Account> sent(List<Account> accounts) {
        HashSet<Account> result = new HashSet<>();
        /* for-each accounts to HashSet; */
        for (Account account : accounts) {
            result.add(account);
        }
        return result;
    }
}
