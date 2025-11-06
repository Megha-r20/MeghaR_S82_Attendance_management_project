package com.school;

public class Staff extends Person implements Storable {
    private String position;

    public Staff(String name, String position) {
        super(name);
        this.position = position;
    }

    @Override
    public void displayDetails() {
        System.out.println("Role: Non-Teaching Staff, Name: " + name + ", Position: " + position);
    }

    public String toDataString() {
        return getId() + "," + name + "," + position;
    }
}
