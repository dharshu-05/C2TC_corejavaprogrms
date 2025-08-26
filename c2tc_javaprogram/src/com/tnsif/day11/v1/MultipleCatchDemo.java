package com.tnsif.day11.v1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        System.out.println("I am in main method");
        int numberOne, numberTwo, numberThree;
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Enter First number: ");
                numberOne = sc.nextInt();

                System.out.println("Enter Second number: ");
                numberTwo = sc.nextInt();

                numberThree = numberOne / numberTwo;
                System.out.println("Division is " + numberThree);

                break; // exit loop if successful
            } 
            catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter integers only.");
                sc.nextLine(); // clear invalid input
            } 
            catch (ArithmeticException e) {
                System.out.println("Error! Division by zero is not allowed.");
            } 
            catch (Exception e) {
                System.out.println("Unexpected error occurred: " + e.getMessage());
            }
        }

        sc.close();
    }
}
