package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "=== Edit item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter Name: ");
        int id = Integer.valueOf(input.askStr("Enter Id: "));
        if (tracker.replace(id, new Item(name))) {
            System.out.println("Replace successful.");
        } else {
            System.out.println("Id not found.");
        }
        return true;
    }
}
