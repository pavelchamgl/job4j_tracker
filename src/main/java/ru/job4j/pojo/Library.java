package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {

        Book java7 = new Book("Java 7", 200);
        Book java8 = new Book("Java 8", 200);
        Book code = new Book("Clean code", 200);
        Book patern = new Book("Patern's", 200);
        Book[] library = {java7, java8, code, patern};
        for (int index = 0; index < library.length; index++) {
            Book book = library[index];
            System.out.println(book.getName() + book.getPage() + " стриниц.");
        }

        System.out.println("Replace [0] with [3]");
        Book tmp = library[0];
        library[0] = library[3];
        library[3] = tmp;
        for (int index = 0; index < library.length; index++) {
            Book book = library[index];
            System.out.println(book.getName() + book.getPage() + " стриниц.");
        }

        for (int index = 0; index < library.length; index++) {
            Book book = library[index];
            if (book.getName().equals("Clean code")) {
                System.out.println(book.getName() + " стоит по счету " + library[index]);
            }
        }
    }
}
