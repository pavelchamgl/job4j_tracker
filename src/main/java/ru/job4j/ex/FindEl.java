package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int index = 0; index < value.length; index++) {
            if (value[index].equals(key)) {
                rsl = index;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException(" Key not found.");
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            indexOf(new String[] {"1", "2", "3"}, "6");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}