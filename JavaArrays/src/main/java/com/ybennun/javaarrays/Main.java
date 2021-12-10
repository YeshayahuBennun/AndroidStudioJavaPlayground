package com.ybennun.javaarrays;

public class Main {
    public static void main(String[] args) {
        int[] myArray = {1, 33, 4, 12, 89, 98}; //length = 6
        String[] names = {"James", "Anthony", "Rodrigo", "Niraj"};

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Items: " + myArray[i]);
        }

        System.out.println(myArray[0]);
    }
}