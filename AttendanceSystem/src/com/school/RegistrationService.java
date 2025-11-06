package com.school;

import java.util.*;

public class RegistrationService {
    private List<Student> students = new ArrayList<>();
    private List<Teacher> teachers = new ArrayList<>();
    private List<Staff> staffMembers = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();
    private FileStorageService storageService;

    public RegistrationService(FileStorageService storageService) {
        this.storageService = storageService;
    }

    // --- Registration methods ---
    public Student registerStudent(String name, String grade) {
        Student s = new Student(name, grade);
        students.add(s);
        return s;
    }

    public Teacher registerTeacher(String name, String subject) {
        Teacher t = new Teacher(name, subject);
        teachers.add(t);
        return t;
    }

    public Staff registerStaff(String name, String position) {
        Staff st = new Staff(name, position);
        staffMembers.add(st);
        return st;
    }

    // Updated to include capacity
    public Course createCourse(String courseName, int capacity) {
        Course c = new Course(courseName, capacity);
        courses.add(c);
        return c;
    }

    // --- Getters ---
    public List<Student> getStudents() { return students; }
    public List<Teacher> getTeachers() { return teachers; }
    public List<Staff> getStaffMembers() { return staffMembers; }
    public List<Course> getCourses() { return courses; }

    public List<Person> getAllPeople() {
        List<Person> people = new ArrayList<>();
        people.addAll(students);
        people.addAll(teachers);
        people.addAll(staffMembers);
        return people;
    }

    // --- Finders ---
    public Student findStudentById(int id) {
        for (Student s : students) if (s.getId() == id) return s;
        return null;
    }

    public Course findCourseById(int id) {
        for (Course c : courses) if (c.getId() == id) return c;
        return null;
    }

    // --- Enrollment Management ---
    public boolean enrollStudentInCourse(Student student, Course course) {
        if (student == null || course == null) {
            System.out.println("⚠️ Invalid student or course!");
            return false;
        }

        boolean success = course.addStudent(student);
        if (success) {
            System.out.println("✅ " + student.getName() + " successfully enrolled in " + course.getCourseName());
        } else {
            System.out.println("❌ Enrollment failed: Course '" + course.getCourseName() + "' is full!");
        }
        return success;
    }

    // --- Save all registrations ---
    public void saveAllRegistrations() {
        storageService.saveData(students, "students.txt");
        storageService.saveData(teachers, "teachers.txt");
        storageService.saveData(staffMembers, "staff.txt");
        storageService.saveData(courses, "courses.txt");
    }
}
