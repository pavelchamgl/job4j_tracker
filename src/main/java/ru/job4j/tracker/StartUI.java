package ru.job4j.tracker;

public class StartUI {

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void findAllItem(Tracker tracker) {
        System.out.println("=== Show all items ====");
        Item[] items = tracker.findAll();
        for (int index = 0; index < items.length - 1; index++) {
            System.out.println(index + ". " + items[index].getName());
        }
    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Edit item ====");
        String name = input.askStr("Enter Name: ");
        int id = Integer.valueOf(input.askStr("Enter Id: "));
        if (tracker.replace(id, new Item(name))) {
            System.out.println("Replace successful.");
        } else {
            System.out.println("Id not found.");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete item ====");
        int id = Integer.valueOf(input.askStr("Enter Id: "));
        if (tracker.delete(id)) {
            System.out.println("Delete successful.");
        } else {
            System.out.println("Id not found.");
        }
    }

    public static void findItemById(Input input, Tracker tracker) {
        System.out.println("=== Find Item by Id ====");
        int id = Integer.valueOf(input.askStr("Enter Id: "));
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println("Item name is: " + item.getName());
        } else {
            System.out.println("Item with these Id not found.");
        }
    }

    public static void findItemByName(Input input, Tracker tracker) {
        System.out.println("=== Find Items by name ====");
        String name = input.askStr("Enter name: ");
        Item[] items = tracker.findByName(name);
        for (int index = 0; index < items.length; index++) {
            System.out.println(index + ". " + items[index]);
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr("Select:"));
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.findAllItem(tracker);
            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findItemById(input, tracker);
            } else if (select == 5) {
                StartUI.findItemByName(input, tracker);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}