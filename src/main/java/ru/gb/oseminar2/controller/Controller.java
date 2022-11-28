package ru.gb.oseminar2.controller;

import ru.gb.oseminar2.data.*;
import ru.gb.oseminar2.service.StudyGroupService;
import ru.gb.oseminar2.service.UserService;
import ru.gb.oseminar2.view.StudentView;
import ru.gb.oseminar2.data.User;
import ru.gb.oseminar2.view.StudyGroupView;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    private final UserService userService = new UserService();

    private final StudentView studentView = new StudentView();

    private final StudyGroupService studyGroupService = new StudyGroupService();
    private final StudyGroupView studyGroupView =  new StudyGroupView();

    public void createStudent (String firstName, String lastName, String patronymic) {
        userService.createStudent(firstName, lastName, patronymic);
        List<User> students = userService.getAll();
        studentView.sendOnConsole(students);
    }
    public void createTeacher (String firstName, String lastName, String patronymic) {
        userService.createTeacher(firstName, lastName, patronymic);
        List<User> teacher = userService.getAll();
        studentView.sendOnConsole(teacher);
    }

    public void createGroup () {
        List<Student> students = new ArrayList<>();
        Teacher teacher = null;
        for (User user: this.userService.getAll()){
            if (user instanceof Student) {
                students.add((Student) user);
            } else if (user instanceof Teacher) {
                teacher = ((Teacher) user);
            }
        }
        studyGroupService.createStudyGroup(teacher, students);
        StudyGroup studyGroup = studyGroupService.getStudyGroup();
        studyGroupView.sendOnConsole(studyGroup);
    }

}