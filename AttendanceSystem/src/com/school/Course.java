package com.school;

import java.util.ArrayList;
import java.util.List;

public class Course implements Storable {
    private static int idCounter = 100;
    private int id;
    private String courseName;
    private int capacity;
    private List<Student> enrolledStudents;

    public Course(String courseName, int capacity) {
        this.id = ++idCounter;
        this.courseName = courseName;
        this.capacity = capacity;
        this.enrolledStudents = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public int getNumberOfEnrolledStudents() {
        return enrolledStudents.size();
    }

    public boolean addStudent(Student student) {
        if (enrolledStudents.size() < capacity) {
            enrolledStudents.add(student);
            return true;
        } else {
            return false;
        }
    }

    public void displayDetails() {
        System.out.println("Course ID: " + id);
        System.out.println("Course Name: " + courseName);
        System.out.println("Capacity: " + capacity);
        System.out.println("Currently Enrolled: " + getNumberOfEnrolledStudents());
        if (!enrolledStudents.isEmpty()) {
            System.out.print("Enrolled Students: ");
            for (Student s : enrolledStudents) {
                System.out.print(s.getName() + " ");
            }
            System.out.println();
        }
    }

    @Override
    public String toDataString() {
        return id + "," + courseName + "," + capacity;
    }
}
