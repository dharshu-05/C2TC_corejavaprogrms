package com.tnsif.day6.usingfinal;

final class FinalClass {
    void show() {
        System.out.println("Final class cannot be inherited");
    }
}

// Removed the child class because FinalClass is final

public class FinalClassDemo {
    public static void main(String[] args) {
        // Create the object of final class
        FinalClass f1 = new FinalClass();
        f1.show();
    }
}
