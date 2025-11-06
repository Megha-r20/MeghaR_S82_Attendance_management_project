package com.school;

import java.util.*;

public class AttendanceService {
    private List<AttendanceRecord> attendanceLog = new ArrayList<>();
    private FileStorageService storageService;
    private RegistrationService registrationService;

    public AttendanceService(FileStorageService storageService, RegistrationService registrationService) {
        this.storageService = storageService;
        this.registrationService = registrationService;
    }

    // Direct mark
    public void markAttendance(Student student, Course course, String status) {
        AttendanceRecord record = new AttendanceRecord(student, course, status);
        attendanceLog.add(record);
    }

    // Using IDs
    public void markAttendance(int studentId, int courseId, String status) {
        Student student = registrationService.findStudentById(studentId);
        Course course = registrationService.findCourseById(courseId);

        if (student != null && course != null) {
            markAttendance(student, course, status);
        } else {
            System.out.println("⚠️ Invalid Student ID or Course ID!");
        }
    }

    public void displayAttendanceLog() {
        System.out.println("=== Attendance Log ===");
        for (AttendanceRecord record : attendanceLog) {
            record.displayRecord();
        }
    }

    public void displayAttendanceLog(Student student) {
        System.out.println("=== Attendance Log for " + student.getName() + " ===");
        for (AttendanceRecord record : attendanceLog) {
            if (record.getStudent().equals(student)) record.displayRecord();
        }
    }

    public void displayAttendanceLog(Course course) {
        System.out.println("=== Attendance Log for " + course.getCourseName() + " ===");
        for (AttendanceRecord record : attendanceLog) {
            if (record.getCourse().equals(course)) record.displayRecord();
        }
    }

    public void saveAttendanceData() {
        storageService.saveData(attendanceLog, "attendance_log.txt");
    }
}
