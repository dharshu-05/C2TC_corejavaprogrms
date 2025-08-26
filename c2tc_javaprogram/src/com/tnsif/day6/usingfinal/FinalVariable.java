package com.tnsif.day6.usingfinal;

public class FinalVariable {

    // final instance variable must be initialized
    final int x = 100;

    // Declare a static blank final variable (must be initialized in static block)
    final static int y;

    // Declare & initialize static final variable
    final static int z = 10;

    // Static block to initialize static blank final variable y
    static {
        y = 50;
    }

    // instance method
    void display() {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }

    @Override
    public String toString() {
        return "FinalVariable [x=" + x + ", y=" + y + ", z=" + z + "]";
    }

    public static void main(String[] args) {
        FinalVariable obj = new FinalVariable();
        System.out.println(obj);
        obj.display();
    }
}
