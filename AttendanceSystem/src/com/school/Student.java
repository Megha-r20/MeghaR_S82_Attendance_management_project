package com.school;

public class Student {
    private int studentId;
    private String name;

    // Method to set details
    public void setDetails(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Student ID: " + studentId + ", Name: " + name);
    }
}
