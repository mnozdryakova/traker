package org.example;

public class CreateAction implements UserAction {
    @Override
    public String name() {
        return "Добавить новую заявку";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Введите название заявки: ");
        Request request = new Request(name);
        tracker.add(request);
        System.out.println("Заявка добавлена с ID: " + request.getId());
        return true;
    }
}
