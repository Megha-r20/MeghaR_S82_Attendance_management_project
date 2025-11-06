public class Main {
    public static void main(String[] args) {
        RegistrationService registrationService = new RegistrationService();

        // Create courses with capacity
        Course c1 = registrationService.createCourse("C101", "Mathematics", "Dr. Rao", 2);
        Course c2 = registrationService.createCourse("C102", "Physics", "Dr. Mehta", 1);

        // Create students
        Student s1 = new Student("S001", "Alice", "CSE");
        Student s2 = new Student("S002", "Bob", "ECE");
        Student s3 = new Student("S003", "Charlie", "EEE");

        // Enroll students
        registrationService.enrollStudentInCourse(s1, c1);
        registrationService.enrollStudentInCourse(s2, c1);
        registrationService.enrollStudentInCourse(s3, c1); // exceeds capacity

        registrationService.enrollStudentInCourse(s1, c2);
        registrationService.enrollStudentInCourse(s2, c2); // exceeds capacity

        // Display course details
        System.out.println("\n--- Course Details After Enrollment ---");
        c1.displayDetails();
        System.out.println();
        c2.displayDetails();
    }
}
