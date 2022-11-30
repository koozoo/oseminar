package ru.gb.oseminar2.service;

import ru.gb.oseminar2.data.Student;
import ru.gb.oseminar2.data.StudyGroup;
import ru.gb.oseminar2.data.Teacher;
import ru.gb.oseminar2.data.User;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupService{

    private List<StudyGroup> studyGroups;


    public StudyGroupService() {
        this.studyGroups = new ArrayList<StudyGroup>();
    }

    public void createStudyGroup(Teacher teacher, List<Student> students) {
        Long groupID = 0L;
        for (StudyGroup group: this.studyGroups) {
            if (groupID < (group.getGroupID())){
                groupID = group.getGroupID();
            }
        }
        ++ groupID;
        teacher.setGroupID(groupID);
        for (Student student: students){
            student.setGroupID(groupID);
        }
        this.studyGroups.add(new StudyGroup(teacher, students, groupID));
    }

    public List<StudyGroup> getStudyGroup() {
        return studyGroups;
    }

    public void setStudyGroup(List<StudyGroup> studyGroup) {
        this.studyGroups = studyGroup;
    }

    public List<StudyGroup> getStudyGroups() {
        return studyGroups;
    }

    public void setStudyGroups(List<StudyGroup> studyGroups) {
        this.studyGroups = studyGroups;
    }
}
