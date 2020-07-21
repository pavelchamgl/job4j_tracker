package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "=== Delete item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        boolean result = true;
        int id = Integer.valueOf(input.askStr("Enter Id: "));
        if (tracker.delete(id)) {
            System.out.println("Delete successful.");
        } else {
            System.out.println("Id not found.");
            result = false;
        }
        return result;
    }
}
