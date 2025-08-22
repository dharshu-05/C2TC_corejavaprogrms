package com.tnsif.day9;

public class WrapperClassDemoOne {
    public static void main(String[] args) {
        String str = "123";

        // Convert String to int
        int num = Integer.parseInt(str);
        System.out.println("String to int: " + num);

        // Convert int to String
        String s = Integer.toString(456);
        System.out.println("int to String: " + s);
    }
}
