package ru.job4j.profession;

public class Doctor extends Profession {

    public Doctor(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public String work() {
        return "";
    }
}