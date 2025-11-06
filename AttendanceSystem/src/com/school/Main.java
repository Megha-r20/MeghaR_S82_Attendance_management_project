package com.school;

import java.util.*;

public class Main {

    public static void displaySchoolDirectory(List<Person> people) {
        System.out.println("=== School Directory ===");
        for (Person person : people) {
            person.displayDetails(); // Polymorphic call
            System.out.println("----------------------");
        }
    }

    public static void main(String[] args) {
        // Create Students
        Student s1 = new Student("Megha", "10th Grade");
        Student s2 = new Student("Rahul", "9th Grade");

        // Create Teacher and Staff
        Teacher t1 = new Teacher("Ravi", "Mathematics");
        Staff st1 = new Staff("Priya", "Librarian");

        // Create list for polymorphism
        ArrayList<Person> schoolPeople = new ArrayList<>();
        schoolPeople.add(s1);
        schoolPeople.add(s2);
        schoolPeople.add(t1);
        schoolPeople.add(st1);

        // Display School Directory
        displaySchoolDirectory(schoolPeople);

        // Create Courses
       Course c1 = new Course("Mathematics");
       Course c2 = new Course("Science");


        // Create Attendance Records (using actual objects)
        AttendanceRecord r1 = new AttendanceRecord(s1, c1, "Present");
        AttendanceRecord r2 = new AttendanceRecord(s1, c2, "Absent");

        System.out.println("=== Attendance Log ===");
        r1.displayRecord();
        r2.displayRecord();

        // Prepare lists for saving data
        ArrayList<Student> students = new ArrayList<>();
        for (Person p : schoolPeople) {
            if (p instanceof Student) {
                students.add((Student) p);
            }
        }

        ArrayList<Course> courses = new ArrayList<>();
        courses.add(c1);
        courses.add(c2);

        ArrayList<AttendanceRecord> records = new ArrayList<>();
        records.add(r1);
        records.add(r2);

        // Save data
        FileStorageService storage = new FileStorageService();
        storage.saveData(students, "students.txt");
        storage.saveData(courses, "courses.txt");
        storage.saveData(records, "attendance_log.txt");
    }
}
