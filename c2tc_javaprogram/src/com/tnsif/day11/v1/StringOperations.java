package com.tnsif.day11.v1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int startIndex, endIndex;
            String message;

            System.out.println("Enter the message: ");
            message = sc.nextLine();

            System.out.println("Enter the start index and end index: ");
            startIndex = sc.nextInt();
            endIndex = sc.nextInt();

            if (startIndex < 0 || endIndex > message.length() || startIndex > endIndex) {
                System.err.println("Invalid indices!");
            } else {
                String result = message.substring(startIndex, endIndex);
                System.out.println("Substring is: " + result);
            }

            sc.close();
        } catch (InputMismatchException ae) {
            System.err.println("Error! Invalid input");
        }
    }
}
