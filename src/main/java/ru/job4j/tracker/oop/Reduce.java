package ru.job4j.tracker.oop;

public class Reduce {
    private int[] array;

    public void to(int[] array) {
        this.array = array; // чтобы записать в поля класса аргумент метода используется слово this как в конструкторе
    }

    public void print() {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}
