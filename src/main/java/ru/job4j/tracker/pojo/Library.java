package ru.job4j.tracker.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Goodbye weapons", 250);
        Book book2 = new Book("Clean code", 234);
        Book book3 = new Book("The art of programming", 1089);
        Book book4 = new Book("Surreal numbers", 479);
        Book[] arrayBook = new Book[4];
        arrayBook[0] = book1;
        arrayBook[1] = book2;
        arrayBook[2] = book3;
        arrayBook[3] = book4;
        for (int i = 0; i < arrayBook.length; i++) {
            System.out.println(arrayBook[i].getName() + " " + arrayBook[i].getNumberPages());
        }
        System.out.println("Переставьте местами книги с индексом 0 и 3. Выведите содержимое массива на консоль.");
        Book upBook = arrayBook[3];
        arrayBook[3] = arrayBook[0];
        arrayBook[0] = upBook;
        for (int i = 0; i < arrayBook.length; i++) {
            System.out.println(arrayBook[i].getName() + " " + arrayBook[i].getNumberPages());
        }
        System.out.println("Добавьте цикл с выводом книг с именем \"Clean code\"");
        for (int i = 0; i < arrayBook.length; i++) {
            if (arrayBook[i].getName().equals("Clean code")) {
                System.out.println(arrayBook[i].getName() + " " + arrayBook[i].getNumberPages());
            }
        }
    }
}
