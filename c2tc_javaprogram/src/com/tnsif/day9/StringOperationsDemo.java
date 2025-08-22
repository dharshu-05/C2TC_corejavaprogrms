package com.tnsif.day9;

public class StringOperationsDemo {
    public static void main(String[] args) {
        String str = "   Java Programming   ";

        System.out.println("Original: '" + str + "'");
        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Trimmed: '" + str.trim() + "'");
        System.out.println("Substring(5, 16): " + str.substring(5, 16));
        System.out.println("Contains 'Pro': " + str.contains("Pro"));
    }
}
