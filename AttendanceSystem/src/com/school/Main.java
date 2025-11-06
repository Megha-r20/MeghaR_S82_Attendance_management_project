package com.school;

import java.util.*;

public class Main {
    public static void displaySchoolDirectory(RegistrationService regService) {
        System.out.println("=== School Directory ===");
        for (Person person : regService.getAllPeople()) {
            person.displayDetails();
            System.out.println("----------------------");
        }
    }

    public static void main(String[] args) {
        FileStorageService fileStorage = new FileStorageService();
        RegistrationService regService = new RegistrationService(fileStorage);
        AttendanceService attendanceService = new AttendanceService(fileStorage, regService);

        // Register people
        Student s1 = regService.registerStudent("Megha", "10th Grade");
        Student s2 = regService.registerStudent("Rahul", "9th Grade");
        Teacher t1 = regService.registerTeacher("Ravi", "Mathematics");
        Staff st1 = regService.registerStaff("Priya", "Librarian");

        // Create courses
        Course c1 = regService.createCourse("Mathematics");
        Course c2 = regService.createCourse("Science");

        // Display directory
        displaySchoolDirectory(regService);

        // Mark attendance
        attendanceService.markAttendance(s1, c1, "Present");
        attendanceService.markAttendance(s1, c2, "Absent");
        attendanceService.markAttendance(s2.getId(), c1.getId(), "Present");

        // Display logs
        attendanceService.displayAttendanceLog();
        attendanceService.displayAttendanceLog(s1);
        attendanceService.displayAttendanceLog(c1);

        // Save data
        regService.saveAllRegistrations();
        attendanceService.saveAttendanceData();
    }
}
