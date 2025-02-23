package ru.job4j.tracker.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Иван Иваныч Иванов");
        student.setGroup("M153");
        student.setDateReceipt(new Date());
        System.out.println("Студент " + student.getFullName());
        System.out.println("Группа " + student.getGroup());
        System.out.println("Дата начала " + student.getDateReceipt());
    }
}
