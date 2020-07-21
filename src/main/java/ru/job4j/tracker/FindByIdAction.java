package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "=== Find Item by Id ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        boolean result = true;
        int id = Integer.valueOf(input.askStr("Enter Id: "));
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println("Item name is: " + item.getName());
        } else {
            System.out.println("Item with these Id not found.");
            result = false;
        }
        return result;
    }
}
