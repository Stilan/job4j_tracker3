package ru.job4j.tracker.oop;

public class Cat {

    private String food;
    private String name;

    /**
     * метод изменяет еду котика
     */
    public void show() {
        System.out.println(this.name + " ate " + this.food);
    }

    /**
     * метод  выводит информацию о кличке и еде
     * @param meat названия еды
     */
    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        cat1.giveNick("Gav");
        cat2.giveNick("Black");

        cat1.eat("cutlet");
        cat2.eat("fish");

        cat1.show();
        cat2.show();
    }
}
