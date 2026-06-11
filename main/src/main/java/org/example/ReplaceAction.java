package org.example;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "Заменить заявку по ID";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Введите ID заявки для замены: ");
        String newName = input.askStr("Введите новое название: ");
        Request newRequest = new Request(newName);

        if (tracker.replace(id, newRequest)) {
            System.out.println("Заявка с ID " + id + " заменена");
        } else {
            System.out.println("Заявка с ID " + id + " не найдена");
        }
        return true;
    }
}