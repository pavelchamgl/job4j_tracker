package ru.job4j.profession;

public class Surgeon extends Doctor {

    public Surgeon(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public String heal(People people) {
        return "";
    }
}
