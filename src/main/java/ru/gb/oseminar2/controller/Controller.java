package ru.gb.oseminar2.controller;

import ru.gb.oseminar2.data.*;
import ru.gb.oseminar2.service.StudyGroupService;
import ru.gb.oseminar2.service.UserService;
import ru.gb.oseminar2.view.StudentView;
import ru.gb.oseminar2.data.User;
import ru.gb.oseminar2.view.StudyGroupView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Controller {

    private final UserService userService = new UserService();

    private final StudentView studentView = new StudentView();

    private final StudyGroupService studyGroupService = new StudyGroupService();
    private final StudyGroupView studyGroupView =  new StudyGroupView();

    public List<User> createStudent (String firstName, String lastName, String patronymic) {
        userService.createStudent(firstName, lastName, patronymic);
        List<User> students = userService.getAll();
//        studentView.sendOnConsole(students);
        return students;
    }
    public List<User>  createTeacher (String firstName, String lastName, String patronymic) {
        userService.createTeacher(firstName, lastName, patronymic);
        List<User> teacher = userService.getAll();
//        studentView.sendOnConsole(teacher);
        return teacher;
    }

    public void GroupAssembly () {

        List<Student> students = new ArrayList<>();
        Teacher teacher = null;

        for (User user: this.userService.getAll()){
            if (user instanceof Student) {
                if (((Student) user).getGroupID() == null) {
                    students.add((Student) user);
                }

            } else if (user instanceof Teacher) {
                if (((Teacher) user).getGroupID() == null) {
                    teacher = ((Teacher)user);
                }

            }
        }
        studyGroupService.createStudyGroup(teacher, students);
    }

    public void printAllStudentSorted(){
        List<Student> students = userService.convertUserToStudent();
        Collections.sort(students , new StudyGroupComparator());
        studentView.sendOnConsoleWithGroup(students);
    }

    public UserService getUserService() {
        return userService;
    }

    public StudentView getStudentView() {
        return studentView;
    }

    public StudyGroupService getStudyGroupService() {
        return studyGroupService;
    }

    public StudyGroupView getStudyGroupView() {
        return studyGroupView;
    }
}