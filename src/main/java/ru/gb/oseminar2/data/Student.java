package ru.gb.oseminar2.data;

import java.util.List;

public class Student extends User {

    private Long student_id;
    private Long groupID;

    public Student(String firsname, String lastname, String patronymic, Long student_id) {
        super(firsname, lastname, patronymic);
        this.student_id = student_id;
    }


    public void setStudentId(Long student_id) {
        this.student_id = student_id;
    }

    public Long getGroupID() {
        return groupID;
    }

    public void setGroupID(Long groupID) {
        this.groupID = groupID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                '}';
    }

    public Long getStudentID() {
        return student_id;
    }

}
