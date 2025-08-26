package com.tnsif.day12;

import java.util.Scanner;

public class VoterIDGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        Voter voter = new Voter(name, age);

        try {
            voter.generateVoterID();
        } catch (InvalidVoterException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
