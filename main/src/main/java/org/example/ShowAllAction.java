package org.example;

import java.util.List;

public class ShowAllAction implements UserAction {
    @Override
    public String name() {
        return "Показать все заявки";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        List<Request> requests = tracker.findAll();

        if (requests.isEmpty()) {
            System.out.println("Список заявок пуст");
        } else {
            System.out.println("\nСПИСОК ЗАЯВОК");
            for (Request r : requests) {
                System.out.println(r);
            }
        }
        return true;
    }
}