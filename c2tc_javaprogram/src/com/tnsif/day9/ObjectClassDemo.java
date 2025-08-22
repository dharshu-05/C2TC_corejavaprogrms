package com.tnsif.day9;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}

public class ObjectClassDemo {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Dharshu");
        System.out.println(s1);  // toString() called
    }
}
