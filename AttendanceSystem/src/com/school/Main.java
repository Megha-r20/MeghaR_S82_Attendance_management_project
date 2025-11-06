package com.school;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Attendance Management Project - Constructor Initialization & Auto-ID Generation ===");

        // Create students using constructors
        Student[] students = {
            new Student("Alice"),
            new Student("Bob"),
            new Student("Charlie")
        };

        // Create courses using constructors
        Course[] courses = {
            new Course("Mathematics"),
            new Course("Computer Science"),
            new Course("Physics")
        };

        // Display students
        System.out.println("\n--- Student Details ---");
        for (Student student : students) {
            student.displayDetails();
        }

        // Display courses
        System.out.println("\n--- Course Details ---");
        for (Course course : courses) {
            course.displayDetails();
        }
    }
}
