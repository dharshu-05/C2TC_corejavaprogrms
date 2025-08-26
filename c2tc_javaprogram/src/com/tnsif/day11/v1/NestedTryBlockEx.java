package com.tnsif.day11.v1;

import java.util.Scanner;

public class NestedTryBlockEx {

    public static int divide(int x, int y) {
        int z;
        try {
            z = x / y;
            System.out.println("Result of division is z: " + z);
        } catch (ArithmeticException e) {
            System.err.println("Error! Division by zero is not allowed.");
            z = 0; // default safe value
        }
        return z;
    }

    public static void main(String[] args) {
        int x, y, z;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            x = sc.nextInt();

            System.out.print("Enter second number: ");
            y = sc.nextInt();

            z = divide(x, y);  // call method

            if (z == 0 && y == 0) {
                System.out.println("Cannot divide by zero, please provide a valid divisor.");
            } else {
                System.out.println("Division successful, result is: " + z);
            }
        } catch (Exception e) {
            System.err.println("Invalid input. Please enter valid integers.");
        } finally {
            sc.close(); // close the scanner
        }
    }
}
