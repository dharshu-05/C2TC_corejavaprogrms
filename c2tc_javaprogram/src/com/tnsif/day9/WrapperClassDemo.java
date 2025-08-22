package com.tnsif.day9;

public class WrapperClassDemo {
    public static void main(String[] args) {
        int a = 10;
        Integer i = Integer.valueOf(a);  // Boxing
        int b = i.intValue();            // Unboxing

        System.out.println("Primitive int: " + a);
        System.out.println("Wrapper Integer: " + i);
        System.out.println("Unboxed int: " + b);
    }
}
