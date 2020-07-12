package ru.job4j.oop;

public class Cat {

    private String name;

    private String food;

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void show() {
        System.out.println("There are " + this.name + "'s food - " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.giveNick("gav");
        gav.eat("kotleta");
        gav.show();
        Cat black = new Cat();
        black.giveNick("black");
        black.eat("fish");
        black.show();
    }
}