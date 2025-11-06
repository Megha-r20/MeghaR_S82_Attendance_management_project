package com.school;

public class Course implements Storable {
    private static int idCounter = 100;
    private int id;
    private String courseName;

    public Course(String courseName) {
        this.id = ++idCounter;
        this.courseName = courseName;
    }

    public int getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void displayDetails() {
        System.out.println("Course ID: " + id + ", Course Name: " + courseName);
    }

    @Override
    public String toDataString() {
        return id + "," + courseName;
    }
}
