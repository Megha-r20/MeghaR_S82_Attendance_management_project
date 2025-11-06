package com.school;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Attendance Management Project - Core Domain Modelling ===");

        // Create arrays for Students and Courses
        Student[] students = new Student[2];
        Course[] courses = new Course[2];

        // Initialize and set student details
        students[0] = new Student();
        students[0].setDetails(101, "Alice");

        students[1] = new Student();
        students[1].setDetails(102, "Bob");

        // Initialize and set course details
        courses[0] = new Course();
        courses[0].setDetails(201, "Mathematics");

        courses[1] = new Course();
        courses[1].setDetails(202, "Computer Science");

        // Display all student details
        System.out.println("\n--- Student Details ---");
        for (Student student : students) {
            student.displayDetails();
        }

        // Display all course details
        System.out.println("\n--- Course Details ---");
        for (Course course : courses) {
            course.displayDetails();
        }
    }
}
