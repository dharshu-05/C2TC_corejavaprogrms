package com.tnsif.day11.v1;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {2, 4, 5, 6};

        System.out.println("The array elements are:");
        for (int num : arr) {
            System.out.println(num);
        }

        try {
            System.out.print("Enter the index to fetch element: ");
            int index = sc.nextInt();

            if (index >= 0 && index < arr.length) {
                System.out.println("The element is: " + arr[index]);
            } else {
                System.out.println("Error!... Invalid index. Please enter between 0 and " + (arr.length - 1));
            }
        } catch (Exception e) {
            System.out.println("Error!... Invalid input. Please enter a valid integer index.");
        }

        sc.close();
    }
}
