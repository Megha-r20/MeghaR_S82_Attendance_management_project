package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Megha", "10th Grade");
        Teacher t1 = new Teacher("Ravi", "Mathematics");
        Staff st1 = new Staff("Priya", "Librarian");

        System.out.println("\n=== Person Hierarchy ===");
        s1.displayDetails();
        t1.displayDetails();
        st1.displayDetails();

        // Attendance validation demo
        Course c1 = new Course(101, "Mathematics");
        Course c2 = new Course(102, "Physics");

        List<AttendanceRecord> attendanceLog = new ArrayList<>();
        attendanceLog.add(new AttendanceRecord(s1.getId(), c1.getCourseId(), "Present"));
        attendanceLog.add(new AttendanceRecord(s1.getId(), c2.getCourseId(), "Late")); // invalid

        System.out.println("\n=== Attendance Records ===");
        for (AttendanceRecord record : attendanceLog) {
            record.displayRecord();
        }
    }
}
