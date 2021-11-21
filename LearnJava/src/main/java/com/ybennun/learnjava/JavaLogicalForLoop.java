package com.ybennun.learnjava;

public class JavaLogicalForLoop {
    public static void main(String[] args) {

        int x = 0;

        System.out.println();
        System.out.println("First For Loop");
        System.out.println();

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is a multiple of 2");
            }
        }

        System.out.println();
        System.out.println("Second For Loop");
        System.out.println();

        for (; x < 10; x++) {
            if (x % 2 == 0) {
                System.out.println(x + " is a multiple of 2");
            }
        }
    }
}
