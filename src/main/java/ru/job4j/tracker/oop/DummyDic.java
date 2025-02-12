package ru.job4j.tracker.oop;

public class DummyDic {
    /**
     * Метод, который возвращает строку с сообщением
     * @param eng новое слово
     * @return "Неизвестное слово. " + eng
     */
    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic dummyDic = new DummyDic();
        System.out.println(dummyDic.engToRus("java"));
    }
}
