package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Павел");
        student.setSurname("Иванов");
        student.setPatronymic("Сергеевич");
        student.setGroup("Стажер");
        student.setAdmission("01.06.2020");
        System.out.println("Студент " + student.getName() + student.getPatronymic()
                + student.getSurname() + "учится в группе " + student.getGroup() + "."
                + System.lineSeparator() + "Дата поступления: " + student.getAdmission());
    }
}
