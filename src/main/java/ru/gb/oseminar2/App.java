package ru.gb.oseminar2;

import ru.gb.oseminar2.controller.Controller;

public class App {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("Name", "LastName", "Patronymic");
        controller.createStudent("a", "asd", "asdad");
        controller.createStudent("a", "asd", "asdad");
        controller.createTeacher("Name", "LastName", "Patronymic");
        controller.createGroup();

    }
}
