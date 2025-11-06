package com.school;

import java.util.*;

public class Main {

    public static void displaySchoolDirectory(List<Person> people) {
        System.out.println("=== School Directory ===");
        for (Person person : people) {
            person.displayDetails();
            System.out.println("----------------------");
        }
    }

    public static void main(String[] args) {
        // --- Create people ---
        Student s1 = new Student("Megha", "10th Grade");
        Student s2 = new Student("Rahul", "9th Grade");
        Teacher t1 = new Teacher("Ravi", "Mathematics");
        Staff st1 = new Staff("Priya", "Librarian");

        List<Person> schoolPeople = List.of(s1, s2, t1, st1);
        displaySchoolDirectory(schoolPeople);

        // --- Create Courses ---
        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Science");
        List<Course> allCourses = List.of(c1, c2);

        // --- Create Storage and Attendance Services ---
        FileStorageService storage = new FileStorageService();
        AttendanceService attendanceService = new AttendanceService(storage);

        // --- Mark attendance using overloaded methods ---
        attendanceService.markAttendance(s1, c1, "Present");  // by object
        attendanceService.markAttendance(s2, c2, "Absent");   // by object
        attendanceService.markAttendance(s1.getId(), c2.getCourseId(), "Present",
                                         List.of(s1, s2), allCourses); // by ID

        // --- Display logs using overloaded methods ---
        attendanceService.displayAttendanceLog();     // all records
        attendanceService.displayAttendanceLog(s1);   // student-based
        attendanceService.displayAttendanceLog(c2);   // course-based

        // --- Save to file ---
        attendanceService.saveAttendanceData();
    }
}
