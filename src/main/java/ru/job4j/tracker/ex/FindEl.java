package ru.job4j.tracker.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        /* цикл fori, поскольку нам надо найти индекс искомого элемента в массиве */
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                result = i;
                return result;
            }
        }
        throw new ElementNotFoundException("Exception");
    }

    public static void main(String[] args) {
        String[] array = {"q", "w", "err"};
        try {
            int index = indexOf(array, "u");
            System.out.println(index);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
