package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Megha");
        Student s2 = new Student(2, "Ravi");
        Course c1 = new Course(101, "Mathematics");
        Course c2 = new Course(102, "Physics");

        List<AttendanceRecord> attendanceLog = new ArrayList<>();
        attendanceLog.add(new AttendanceRecord(s1.getStudentId(), c1.getCourseId(), "Present"));
        attendanceLog.add(new AttendanceRecord(s2.getStudentId(), c2.getCourseId(), "Absent"));
        attendanceLog.add(new AttendanceRecord(s1.getStudentId(), c2.getCourseId(), "Late")); // invalid test

        for (AttendanceRecord record : attendanceLog) {
            record.displayRecord();
        }
    }
}
