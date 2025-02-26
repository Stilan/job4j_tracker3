package ru.job4j.tracker;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item(1, "Привет");
        System.out.println(item);
    }
}









//    Item item = new Item(1, "Привет");
//    LocalDateTime localDateTime = item.getCreated();
//    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
//        System.out.println(localDateTime.format(formatter));
//                User user = new User(1, "root", "root");
//                System.out.println(user);