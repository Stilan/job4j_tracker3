package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    private final Output output;

    public DeleteAction(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "Удалить заявку";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        output.println("=== Удаление заявки ===");
        int id = input.askInt("Введите id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            tracker.delete(id);
            output.println("Заявка удалена успешно.");
            return true;
        } else {
            output.println("Ошибка удаления заявки. Заявка не найдена.");
            return false;
        }
    }
}
