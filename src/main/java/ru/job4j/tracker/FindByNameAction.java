package ru.job4j.tracker;

import java.util.List;

public class FindByNameAction implements UserAction {
    private final Output out;

    public FindByNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Find Items by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        List<Item> items = tracker.findByName(name);
        int index = 0;
        if (items != null) {
            for (Item item : items) {
                out.println(index + ". " + item.getId());
                index++;
            }
        } else {
            out.println("Item with these Name not found.");
        }
        return true;
    }
}
