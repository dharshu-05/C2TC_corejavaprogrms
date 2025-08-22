package com.tnsif.day9;

public class StringSubClass {
    private String value;

    public StringSubClass(String value) {
        this.value = value;
    }

    public String toUpper() {
        return value.toUpperCase();
    }

    public int length() {
        return value.length();
    }

    public static void main(String[] args) {
        StringSubClass s = new StringSubClass("Hello World");

        System.out.println("Original: " + s.value);
        System.out.println("Uppercase: " + s.toUpper());
        System.out.println("Length: " + s.length());
    }
}
