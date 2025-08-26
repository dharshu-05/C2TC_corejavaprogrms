package com.tnsif.day12;

public class Voter {
    private String name;
    private int age;

    public Voter(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void generateVoterID() throws InvalidVoterException {
        if (age < 18) {
            throw new InvalidVoterException("Age must be 18 or above to generate Voter ID.");
        } else {
            System.out.println("Voter ID generated successfully for: " + name);
        }
    }
}
