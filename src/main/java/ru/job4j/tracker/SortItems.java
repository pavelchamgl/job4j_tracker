package ru.job4j.tracker;

import java.util.Arrays;
import java.util.List;

public class SortItems {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item("Petr"),
                new Item("Ivan"),
                new Item("Pavel"));

        System.out.println("До сортировки");
        System.out.println(items);
        System.out.println("По возрастанию имени");
        items.sort(new SortByNameAscending());
        System.out.println(items);
        System.out.println("По убыванию имени");
        items.sort(new SortByNameDescending());
        System.out.println(items);
    }
}
