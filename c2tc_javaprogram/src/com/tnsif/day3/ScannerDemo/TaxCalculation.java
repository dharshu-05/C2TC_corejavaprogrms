package com.tnsif.day3.ScannerDemo;

public class TaxCalculation {

    // Function to calculate tax
    public void calculateTax(Person person) {
        int age = person.getAge();
        String gender = person.getGender();
        int income = person.getIncome();
        int tax = 0;

        if (age > 65 || gender.equalsIgnoreCase("female")) {
            tax = 0; // exemption
            System.out.println("Tax not applicable for " + gender + " (Age: " + age + ")");
        } else {
            if (income <= 160000)
                tax = 0;
            else if (income <= 500000)
                tax = (income - 160000) * 10 / 100;
            else if (income <= 800000)
                tax = (income - 500000) * 20 / 100 + 34000;
            else
                tax = (income - 800000) * 30 / 100 + 94000;
        }

        person.setTax(tax); // Save tax back in person object
    }
}