package ru.job4j.tracker.oop;

public class Jukebox {
    /**
     * Метод воспроизводит песню в зависимости от переданного параметра.
     * @param position номер песни (1 или 2)
     */
    public void music(int position) {
        switch (position) {
            case 1 -> System.out.println("Пусть бегут неуклюже");
            case 2 -> System.out.println("Спокойной ночи");
            default -> System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox jukebox = new Jukebox();
        jukebox.music(1);
        jukebox.music(2);
        jukebox.music(3);
    }
}
