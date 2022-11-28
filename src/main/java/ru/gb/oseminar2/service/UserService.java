package ru.gb.oseminar2.service;

import ru.gb.oseminar2.data.Student;
import ru.gb.oseminar2.data.Teacher;
import ru.gb.oseminar2.data.User;

import java.util.ArrayList;
import java.util.List;

public class UserService implements DataService {
    private List<User> users;

    public UserService() {
        this.users = new ArrayList<User>();
    }

    @Override
    public void createUser(String firstname, String lastname, String patronymic) {

    }

    public void createStudent(String firstname, String lastname, String patronymic) {
        Long id = 0L;
        for (User user: this.users) {
            if (user instanceof Student) {
                if (id < ((Student) user).getStudentID()) {
                    id = ((Student) user).getStudentID();
                }
            }
        }
        this.users.add(new Student(firstname, lastname, patronymic, ++id));
    }

    public void createTeacher(String firstname, String lastname, String patronymic) {
        Long id = 0L;
        for (User user: this.users) {
            if (user instanceof Teacher) {
                if (id < ((Teacher) user).getTeacherID()) {
                    id = ((Teacher) user).getTeacherID();
                }
            }
        }
        this.users.add(new Teacher(firstname, lastname, patronymic, ++id));
    }

    public List<User> getAll() {
        return this.users;
    }

    @Override
    public void deleteUser(Long id) {
        for (User user : this.users) {
            if (user instanceof Student) {
                if (id.equals(((Student) user).getStudentID())) {
                    this.users.remove(user);
                }
            }
        }
    }
}
