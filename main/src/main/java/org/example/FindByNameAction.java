package org.example;

import java.util.List;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "Найти заявку по имени";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Введите имя заявки: ");
        List<Request> requests = tracker.findByName(name);

        if (requests.isEmpty()) {
            System.out.println("Заявки с именем \"" + name + "\" не найдены");
        } else {
            System.out.println("Найдено " + requests.size() + " заявок:");
            for (Request r : requests) {
                System.out.println(r);
            }
        }
        return true;
    }
}