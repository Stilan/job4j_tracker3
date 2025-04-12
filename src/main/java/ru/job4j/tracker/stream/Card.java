package ru.job4j.tracker.stream;

import java.util.stream.Stream;

public class Card {
    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Card{"
                + "suit=" + suit
                + ", value=" + value
                + '}';
    }

    public static void main(String[] args) {
        Suit[] arraySuit = Suit.values();
        Value[] arrayVaiue = Value.values();
        Stream.of(arraySuit)
                .flatMap(s -> Stream.of(arrayVaiue)
                        .map(v -> new Card(s, v)))
                .map(Object::toString)
                .forEach(System.out::println);
    }
}
