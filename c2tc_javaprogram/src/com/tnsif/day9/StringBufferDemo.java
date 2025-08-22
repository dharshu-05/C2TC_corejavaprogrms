package com.tnsif.day9;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");

        sb.append(" Programming");
        System.out.println("After append: " + sb);

        sb.insert(5, "Language ");
        System.out.println("After insert: " + sb);

        sb.replace(0, 4, "Hello");
        System.out.println("After replace: " + sb);

        sb.delete(5, 14);
        System.out.println("After delete: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}
