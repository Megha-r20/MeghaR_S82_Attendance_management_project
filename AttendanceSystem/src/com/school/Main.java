package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create Students
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Megha", "10th Grade"));
        students.add(new Student("Ravi", "12th Grade"));

        // Create Courses
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course("Mathematics"));
        courses.add(new Course("Physics"));

        // Create Attendance Records
        ArrayList<AttendanceRecord> records = new ArrayList<>();
        records.add(new AttendanceRecord(students.get(0).getId(), courses.get(0).getCourseId(), "Present"));
        records.add(new AttendanceRecord(students.get(1).getId(), courses.get(1).getCourseId(), "Late"));

        // Display Data
        System.out.println("\n=== Students ===");
        for (Student s : students) s.displayDetails();

        System.out.println("\n=== Courses ===");
        for (Course c : courses) c.displayDetails();

        System.out.println("\n=== Attendance Records ===");
        for (AttendanceRecord r : records) r.displayRecord();

        // Save Data to Files
        FileStorageService storage = new FileStorageService();
        storage.saveData(students, "students.txt");
        storage.saveData(courses, "courses.txt");
        storage.saveData(records, "attendance_log.txt");
    }
}
