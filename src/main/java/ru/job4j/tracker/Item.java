package ru.job4j.tracker;

public class Item implements Comparable<Item> {

    private String  id;
    private String name;

    public Item() {
    }

    public Item(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Item another) {
        return CharSequence.compare(name, another.getName());
    }
}