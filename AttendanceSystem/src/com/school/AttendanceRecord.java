package com.school;

public class AttendanceRecord implements Storable {
    private Student student;
    private Course course;
    private String status;

    public AttendanceRecord(Student student, Course course, String status) {
        this.student = student;
        this.course = course;
        this.status = status;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public String getStatus() {
        return status;
    }

    public void displayRecord() {
        System.out.println("Student: " + student.getName() + " (ID: " + student.getId() + ")");
        System.out.println("Course: " + course.getCourseName() + " (Course ID: " + course.getCourseId() + ")");
        System.out.println("Status: " + status);
        System.out.println("--------------------------");
    }

    @Override
    public String toDataString() {
        return student.getId() + "," + course.getCourseId() + "," + status;
    }
}
