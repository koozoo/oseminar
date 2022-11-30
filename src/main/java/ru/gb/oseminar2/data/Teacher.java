package ru.gb.oseminar2.data;

public class Teacher extends User{
    private Long teacherID;
    private Long groupID;

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

    public Long getGroupID() {
        return groupID;
    }

    public void setGroupID(Long groupID) {
        this.groupID = groupID;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherID=" + teacherID +
                '}';
    }
}
