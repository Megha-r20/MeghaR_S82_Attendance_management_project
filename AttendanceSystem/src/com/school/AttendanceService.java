package com.school;

import java.util.*;
import java.io.*;

public class AttendanceService {
    private List<AttendanceRecord> attendanceLog;
    private FileStorageService storageService;

    public AttendanceService(FileStorageService storageService) {
        this.attendanceLog = new ArrayList<>();
        this.storageService = storageService;
    }

    // --- Overloaded Methods for Marking Attendance ---

    public void markAttendance(Student student, Course course, String status) {
        AttendanceRecord record = new AttendanceRecord(student, course, status);
        attendanceLog.add(record);
        System.out.println("✅ Attendance marked for " + student.getName() +
                " in " + course.getCourseName() + " (" + status + ")");
    }

    public void markAttendance(int studentId, int courseId, String status,
                               List<Student> allStudents, List<Course> allCourses) {
        Student student = findStudentById(studentId, allStudents);
        Course course = findCourseById(courseId, allCourses);

        if (student != null && course != null) {
            markAttendance(student, course, status);
        } else {
            System.out.println("⚠️ Could not find student or course for given IDs!");
        }
    }

    // --- Helper methods ---
    private Student findStudentById(int id, List<Student> allStudents) {
        for (Student s : allStudents) {
            if (s.getId() == id) return s;
        }
        return null;
    }

    private Course findCourseById(int id, List<Course> allCourses) {
        for (Course c : allCourses) {
            if (c.getCourseId() == id) return c;
        }
        return null;
    }

    // --- Overloaded Display Methods ---
    public void displayAttendanceLog() {
        System.out.println("\n=== Full Attendance Log ===");
        for (AttendanceRecord record : attendanceLog) {
            record.displayRecord();
        }
    }

    public void displayAttendanceLog(Student student) {
        System.out.println("\n=== Attendance for " + student.getName() + " ===");
        for (AttendanceRecord record : attendanceLog) {
            if (record.getStudent().getId() == student.getId()) {
                record.displayRecord();
            }
        }
    }

    public void displayAttendanceLog(Course course) {
        System.out.println("\n=== Attendance for Course: " + course.getCourseName() + " ===");
        for (AttendanceRecord record : attendanceLog) {
            if (record.getCourse().getCourseId() == course.getCourseId()) {
                record.displayRecord();
            }
        }
    }

    // --- Save data ---
    public void saveAttendanceData() {
        storageService.saveData(attendanceLog, "attendance_log.txt");
    }
}
