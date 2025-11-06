# Attendance Management Project

## Description
This project is part of a Code-Along series to build an Attendance Management System using Java.  
In this part, we have set up the basic project structure and verified that the environment works.

## Project Structure

## Session 2: Core Domain Modelling
- Defined `Student` class with `studentId`, `name`, `setDetails()`, and `displayDetails()` methods.
- Defined `Course` class with `courseId`, `courseName`, `setDetails()`, and `displayDetails()` methods.
- Utilized arrays of objects in `Main.java` to manage and display multiple students and courses.
- Introduced basic usage of the `this` keyword.

### How to Run
1. Navigate to the project root directory.
2. Compile:

## Part 3: Constructor Initialization & Auto-ID Generation
- Implemented parameterized constructors in `Student` and `Course` classes for object initialization.
- Utilized `private static` member variables for automatic and unique ID generation.
- Demonstrated the use of the `this` keyword to distinguish instance variables from constructor parameters.
- Changed `Course`'s `courseId` to `int` for simpler auto-generation and updated its display.
- Updated `Main.java` to use constructors and show ID progression.

### How to Run
1. Navigate to the project root directory.
2. Compile:


## Part 4: Data Encapsulation & Attendance Recording Validation
- Applied encapsulation to `Student` and `Course` classes by making fields `private` and adding public `getters`.
- Introduced a new `AttendanceRecord` class with `private` fields, a constructor, and `getters` to store attendance data.
- Implemented basic validation in the `AttendanceRecord` constructor for the attendance status (allowing only "Present" or "Absent").
- Used an `ArrayList` in `Main.java` to store and display `AttendanceRecord` objects.
- Demonstrated retrieving IDs using getters (e.g., `student1.getStudentId()`) when creating records.

### How to Run
1. Navigate to the project root directory.
2. Compile: `javac src/com/school/*.java` (or list individual files including `AttendanceRecord.java`)
3. Run: `java -cp src com.school.Main`

