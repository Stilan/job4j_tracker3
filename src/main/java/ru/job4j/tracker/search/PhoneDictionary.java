package ru.job4j.tracker.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список пользователей, которые прошли проверку.
     */
    public ArrayList<Person> find(String key) {
        Predicate<Person> predicate1 = person -> person.getName().contains(key);
        Predicate<Person> predicate2 = person -> person.getSurname().contains(key);
        Predicate<Person> predicate3 = person -> person.getPhone().contains(key);
        Predicate<Person> predicate4 = person -> person.getAddress().contains(key);
        Predicate<Person> combine = predicate1.or(predicate2)
                .or(predicate3)
                .or(predicate4);
        ArrayList<Person> result = new ArrayList<>();
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
