package ru.gb.oseminar2.data;

import java.util.List;

public class StudyGroup {
    private Teacher teacher;
    private List<Student> students;

    private Long groupID;

    public StudyGroup(Teacher teacher, List<Student> students, Long groupID) {
        this.students = students;
        this.teacher = teacher;
        this.groupID = groupID;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Long getGroupID() {
        return groupID;
    }

    public void setGroupID(Long groupID) {
        this.groupID = groupID;
    }
}
