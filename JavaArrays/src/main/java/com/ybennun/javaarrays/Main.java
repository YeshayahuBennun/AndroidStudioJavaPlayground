package com.ybennun.javaarrays;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] myArray = {1, 33, 4, 12, 89, 98, 90, 12, 43, 1234}; //length = 6
        String[] names = {"James", "Anthony", "Rodrigo", "Niraj"};

        int[] newArray = new int[4];
        String[] newName = new String[5];

        newArray[0] = 12;
        newArray[1] = 13;
        newArray[2] = 133;
        newArray[3] = 113;


        for (int i = 0; i < newArray.length; i++) {
            System.out.println("Items: " + newArray[i]);
        }


    }
}