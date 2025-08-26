package com.tnsif.day11.v1;

public class Demo {
    public static void main(String[] args) {
        try {
            System.out.println("The program continues...");
            int data = 100 / 0;  // This will cause an ArithmeticException
            System.out.println("Result is: " + data); // This line won't be executed due to exception
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero is not allowed.");
        }

        // Code here will execute after the try-catch block
        System.out.println("Program execution continues after exception handling.");
    }
}

