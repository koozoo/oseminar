package ru.gb.oseminar2.data;

public class Teacher extends User{
    private Long teacherID;

    public Teacher(String firsname, String lastname, String patronymic, Long teacherID) {
        super(firsname, lastname, patronymic);
        this.teacherID = teacherID;
    }

    public Long getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(Long teacherID) {
        this.teacherID = teacherID;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherID=" + teacherID +
                '}';
    }
}
