package org.example;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "Удалить заявку по ID";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Введите ID заявки для удаления: ");

        if (tracker.delete(id)) {
            System.out.println("Заявка с ID " + id + " удалена");
        } else {
            System.out.println("Заявка с ID " + id + " не найдена");
        }
        return true;
    }
}