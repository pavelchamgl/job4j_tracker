package ru.job4j.tracker;

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
        Item[] items = tracker.findByName(name);
        if (items != null) {
            for (int index = 0; index < items.length; index++) {
                System.out.println(index + ". " + items[index]);
            }
        } else {
            System.out.println("Item with these Name not found.");
        }
        return true;
    }
}
