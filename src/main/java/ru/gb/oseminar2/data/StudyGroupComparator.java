package ru.gb.oseminar2.data;

import java.util.Comparator;

public class StudyGroupComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getLastname().equalsIgnoreCase(o2.getLastname())) {
            return o1.getFirstname().compareTo(o2.getFirstname());
        }
        return o1.getLastname().compareTo(o2.getLastname());
    }
}
