package ru.gb.oseminar2.service;

import ru.gb.oseminar2.data.Student;
import ru.gb.oseminar2.data.StudyGroup;
import ru.gb.oseminar2.data.Teacher;
import ru.gb.oseminar2.data.User;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupService{

    private StudyGroup studyGroup;


    public StudyGroupService() {

    }

    public void createStudyGroup(Teacher teacher, List<Student> students) {
        this.studyGroup = new StudyGroup(teacher, students);
    }

    public StudyGroup getStudyGroup() {
        return studyGroup;
    }

    public void setStudyGroup(StudyGroup studyGroup) {
        this.studyGroup = studyGroup;
    }
}
