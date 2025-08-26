package com.tnsif.day11.trycatch;

public class TryCatchExample {

    // Integer division
    public static int performDivision(int a, int b) {
        int result = 0;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero (int).");
        }
        return result;
    }

    // Float division
    public static float performDivision(float a, float b) {
        float result = 0;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero (float).");
        }
        return result;
    }
}
