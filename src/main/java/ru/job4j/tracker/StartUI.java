package ru.job4j.tracker;

public class StartUI {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item one = new Item("Pavel");
        tracker.add(one);
        Item find = tracker.findById(1);
        System.out.println(find.getName());
    }
}
