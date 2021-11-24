package com.ybennun.learnjava;

public class JavaDoWhileLoop {
    public static void main(String[] args) {
        int limit = 10;
        int counter = 1;

        do {
            System.out.println("We keep counting...");
            counter++;
        } while (counter < limit);
    }
}
