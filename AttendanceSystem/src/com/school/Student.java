package com.school;

public class Student {
    private static int nextStudentIdCounter = 1; // Auto-increment ID counter
    private int studentId;
    private String name;

    // Constructor for initialization
    public Student(String name) {
        this.studentId = nextStudentIdCounter++;
        this.name = name;
    }

    // Display details
    public void displayDetails() {
        System.out.println("Student ID: S" + studentId + ", Name: " + name);
    }
}
