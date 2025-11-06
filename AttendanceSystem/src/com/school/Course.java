package com.school;

public class Course {
    private static int nextCourseIdCounter = 101; // Start course IDs at 101
    private int courseId;
    private String courseName;

    // Constructor for initialization
    public Course(String courseName) {
        this.courseId = nextCourseIdCounter++;
        this.courseName = courseName;
    }

    // Display details
    public void displayDetails() {
        System.out.println("Course ID: C" + courseId + ", Course Name: " + courseName);
    }
}
