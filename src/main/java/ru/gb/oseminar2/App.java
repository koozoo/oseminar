package ru.gb.oseminar2;

import ru.gb.oseminar2.controller.Controller;
import ru.gb.oseminar2.data.Student;
import ru.gb.oseminar2.data.Teacher;
import ru.gb.oseminar2.data.User;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.createStudent("Vasya", "Petrov", "Patronymic");
        controller.createStudent("Petya", "Ivanov", "Vasivich");
        controller.createStudent("Masha", "Dee", "Asad");
        controller.createTeacher("Valentina", "Kukina", "Petrovna");
        controller.GroupAssembly();


        controller.createStudent("Vasya", "Petrov", "Patronymic");
        controller.createStudent("Petya", "Ivanov", "Vasivich");
        controller.createStudent("Masha", "Dee", "Asad");
        controller.createTeacher("Valentina", "Kukina", "Petrovna");
        controller.GroupAssembly();


        controller.createStudent("Vasya", "Petrov", "Patronymic");
        controller.createStudent("Petya", "Ivanov", "Vasivich");
        controller.createStudent("Masha", "Dee", "Asad");
        controller.createTeacher("Valentina", "Kukina", "Petrovna");
        controller.GroupAssembly();

        controller.printAllStudentSorted();
//        controller.getStudentView().sendOnConsoleWithGroup();
    }
}
