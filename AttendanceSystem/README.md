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

## Part 5: Establishing Students, Teaching & Non-Teaching Staff hierarchy
- Created a base class `Person.java` with common attributes (`id`, `name`), a universal auto-ID generator, and a `displayDetails()` method.
- Modified `Student.java` to inherit from `Person`, using `super()` to call the parent constructor and overriding `displayDetails()` to add student-specific info (e.g., grade level).
- Created `Teacher.java` extending `Person`, adding a `subjectTaught` attribute and its own `displayDetails()`.
- Created `Staff.java` extending `Person`, adding a `role` attribute and its own `displayDetails()`.
- Demonstrated creation and display of `Student`, `Teacher`, and `Staff` objects in `Main.java`.
- Updated `AttendanceRecord` creation to use the inherited `getId()` method.

## Part 6: Interface-Driven Persistence with Storage
- Defined a `Storable` interface with a `toDataString()` method.
- Modified `Student`, `Course`, and `AttendanceRecord` classes to implement the `Storable` interface and provide their specific `toDataString()` implementations (CSV format).
- Created a `FileStorageService` class with a `saveData(List<? extends Storable> items, String filename)` method to write `Storable` objects to a text file.
- Utilized `try-with-resources` for safe file handling (`PrintWriter`, `FileWriter`).
- Demonstrated in `Main.java` how to save lists of students, courses, and attendance records to separate files (`students.txt`, `courses.txt`, `attendance_log.txt`).
- Discussed the flexibility provided by interfaces for handling different types of storable objects uniformly.

### How to Run
1. Navigate to the project root directory.
2. Compile: `javac src/com/school/*.java`
3. Run: `java -cp src com.school.Main`
4. Check the generated files: `students.txt`, `courses.txt`, `attendance_log.txt`.

## Part 07: Polymorphic Behaviour in Attendance and Displaying Reports

- Implemented runtime polymorphism using `Person` hierarchy.
- Updated `AttendanceRecord` to reference `Student` and `Course` objects.
- Added `displaySchoolDirectory()` for polymorphic display.
- Verified creation of students.txt, courses.txt, and attendance_log.txt.


## Part 8: Overloaded Commands for Attendance and Querying
- Implemented `AttendanceService` class to manage attendance using overloaded methods.
- Supported:
  - Marking attendance using Student/Course objects.
  - Marking attendance using IDs.
  - Querying attendance for a specific student or course.
- Demonstrated method overloading and filtering with polymorphism.
- Integrated data persistence via `FileStorageService`.

### How to Run
1. Navigate to project root.
2. Compile: `javac -encoding UTF-8 -d out src/com/school/*.java`
3. Run: `java -cp out com.school.Main`
4. Check generated file: `attendance_log.txt`

### Output
- Console shows all overloaded attendance logs.
- `attendance_log.txt` contains saved records.

Mentor: “Update README.md.”
## Part 9: SOLID Service Layer: RegistrationService & AttendanceService Separation
- Applied the Single Responsibility Principle (SRP) by creating dedicated service classes.
- Created `RegistrationService.java` to handle the registration, management (lists, lookups), and saving of `Student`, `Teacher`, `Staff`, and `Course` entities.
- Modified `Teacher.java` and `Staff.java` to implement `Storable` for file persistence.
- Refactored `AttendanceService.java`:
    - It now depends on `RegistrationService` for looking up students/courses by ID.
    - Removed internal lookup helper methods, delegating this to `RegistrationService`.
    - Its primary focus is now solely on managing attendance records.
- Updated `Main.java` to act as an orchestrator, instantiating and using these services. Direct entity list management was removed from `Main`.
- Demonstrated improved code organization and clearer separation of concerns.

### How to Run
1. Navigate to the project root directory.
2. Compile: `javac src/com/school/*.java`
3. Run: `java -cp src com.school.Main`
4. Check for `students.txt`, `teachers.txt`, `staff.txt`, `courses.txt`, and `attendance_log.txt`.


## Part 10: Course Capacity & Enrollment Management

### Features Added
- Introduced course capacity limit.
- Automatic section balancing through enrollment checks.
- Enhanced `Course`, `RegistrationService`, and `Main` classes.

### SOLID Principles Reflected
- **Single Responsibility:** Each class handles only its concern (Student, Course, RegistrationService).
- **Open/Closed:** New features (like capacity) were added without changing existing logic.
- **Liskov Substitution:** Subclasses and interfaces remain substitutable.
- **Interface Segregation:** Classes have focused, minimal interfaces.
- **Dependency Inversion:** High-level modules depend on abstractions, not concretions.

🎯 **Final Reflection:**  
This project reinforced encapsulation, modular design, and real-world software engineering workflows with Git and version control.
