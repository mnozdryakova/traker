package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private final Input input;
    private final Tracker tracker;
    private final List<UserAction> actions = new ArrayList<>();

    public Main(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
        fillActions();
    }

    private void fillActions() {
        actions.add(new CreateAction());
        actions.add(new ReplaceAction());
        actions.add(new DeleteAction());
        actions.add(new ShowAllAction());
        actions.add(new FindByNameAction());
        actions.add(new ExitAction());
    }

    public void run() {
        boolean running = true;

        while (running) {
            showMenu();
            int choice = input.askInt("Выберите пункт меню: ");

            if (choice >= 0 && choice < actions.size()) {
                running = actions.get(choice).execute(input, tracker);
            } else {
                System.out.println("Неверный выбор! Попробуйте снова.");
            }
        }
    }

    private void showMenu() {
        System.out.println("МЕНЮ ПРОГРАММЫ");
        for (int i = 0; i < actions.size(); i++) {
            System.out.println(i + ". " + actions.get(i).name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        Main ui = new Main(input, tracker);
        ui.run();
    }
}
