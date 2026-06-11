package org.example;

public class ExitAction implements UserAction {
    @Override
    public String name() {
        return "Выйти из программы";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("the end");
        return false;
    }
}