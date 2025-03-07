package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "Удалить заявку";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Удаление заявки ===");
        int id = input.askInt("Введите id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            tracker.delete(id);
            System.out.println("Заявка удалена успешно.");
            return true;
        } else {
            System.out.println("Ошибка удаления заявки. Заявка не найдена.");
            return false;
        }
    }
}
