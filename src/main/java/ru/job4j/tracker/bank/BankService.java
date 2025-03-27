package ru.job4j.tracker.bank;

import java.util.*;

import java.util.List;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
           users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void deleteUser(String passport) {
        users.remove(findByPassport(passport));
    }

    public void addAccount(String passport, Account account) {
        User userAcc = findByPassport(passport);
        if (userAcc != null) {
            List<Account> arrayList = users.get(userAcc);
            if (!arrayList.contains(account)) {
                arrayList.add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account accountUser = null;
        User userAcc = findByPassport(passport);
        if (userAcc == null) {
            return accountUser;
        }
        List<Account> accounts = users.get(userAcc);
        for (Account account : accounts) {
            if (account.getRequisite().equals(requisite)) {
                accountUser = account;
                return accountUser;
            }
        }
        return accountUser;
    }

    public boolean transferMoney(String sourcePassport, String sourceRequisite,
                                 String destinationPassport, String destinationRequisite,
                                 double amount) {
        boolean result = false;

        Account accountSource = findByRequisite(sourcePassport, sourceRequisite);
        Account accountDestination = findByRequisite(destinationPassport, destinationRequisite);
        if (accountSource != null && accountDestination != null && accountSource.getBalance() >= amount) {
            accountDestination.setBalance(accountDestination.getBalance() + amount);
            accountSource.setBalance(accountSource.getBalance() - amount);
            result = true;
        }

        return result;
    }

    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
