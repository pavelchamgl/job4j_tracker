package ru.job4j.tracker;

public class FindAllAction implements UserAction {
    @Override
    public String name() {
        return "=== Show all items ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] items = tracker.findAll();
        for (int index = 0; index < items.length - 1; index++) {
            System.out.println(index + ". " + items[index].getName());
        }
        return true;
    }
}