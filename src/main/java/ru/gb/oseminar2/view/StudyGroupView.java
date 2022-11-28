package ru.gb.oseminar2.view;

import ru.gb.oseminar2.data.Student;
import ru.gb.oseminar2.data.StudyGroup;
import ru.gb.oseminar2.data.Teacher;

import java.util.List;
import java.util.logging.Logger;

public class StudyGroupView {

    public void sendOnConsole(StudyGroup studyGroup){
        Logger log = Logger.getLogger(StudyGroupView.class.getName());
        Teacher teacher = studyGroup.getTeacher();
        List<Student> students = studyGroup.getStudents();
        log.info("StudyGroup " + "(" +teacher.toString()+ " and Students:" + students.toString());
    }

}
