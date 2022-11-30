package ru.gb.oseminar2.view;

import ru.gb.oseminar2.data.Student;
import ru.gb.oseminar2.data.User;

import java.util.List;
import java.util.logging.Logger;

public class StudentView{
    public void sendOnConsole(List<? extends User> users) {
        Logger log = Logger.getLogger(StudentView.class.getName());
        for (User user : users) {
            log.info(user.toString());
        }
    }

    public void sendOnConsoleWithGroup(List<? extends User> users) {
        Logger log = Logger.getLogger(StudentView.class.getName());
        for (User user : users) {
            if (user instanceof Student) {
                Long groupIdStudent = ((Student) user).getGroupID();
                Long studentID = ((Student) user).getStudentID();
                log.info("STUDENT_ID:" + studentID + " " + user.getFirstname() + " " + user.getLastname() + " - группа " + groupIdStudent);
            }

        }
    }
}