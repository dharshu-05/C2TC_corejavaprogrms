package com.tnsif.day3.ScannerDemo;

public class PersonDemo{
    private String name;
    private int age;
    private String gender;
    private int income;

    // Default constructor (needed for "new Person()")
    public PersonDemo() {
    }

    // Parameterized constructor (optional, if you want to set at creation)
    public PersonDemo(String name, int age, String gender, int income) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.income = income;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public int getIncome() { return income; }
    public void setIncome(int income) { this.income = income; }

    // Override toString for display
    @Override
    public String toString() {
        return "Person [Name=" + name + ", Age=" + age + 
               ", Gender=" + gender + ", Income=" + income + "]";
    }
}
