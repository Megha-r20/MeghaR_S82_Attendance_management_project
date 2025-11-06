package com.school;

public class Teacher extends Person implements Storable {
    private String subject;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    @Override
    public void displayDetails() {
        System.out.println("Role: Teacher, Name: " + name + ", Subject: " + subject);
    }

    public String toDataString() {
        return getId() + "," + name + "," + subject;
    }
}
