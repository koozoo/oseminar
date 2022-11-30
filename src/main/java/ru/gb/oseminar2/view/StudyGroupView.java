package ru.gb.oseminar2.view;

import ru.gb.oseminar2.data.Student;
import ru.gb.oseminar2.data.StudyGroup;
import ru.gb.oseminar2.data.Teacher;

import java.util.List;
import java.util.logging.Logger;

public class StudyGroupView {

    public void sendOnConsole(List<StudyGroup> studyGroups){
        Logger log = Logger.getLogger(StudyGroupView.class.getName());
        for (StudyGroup group: studyGroups) {
            log.info("StudyGroup ");
//            log.info("StudyGroup " + "(" +teacher.toString()+ " and Students:" + students.toString());
        }

    }

}
