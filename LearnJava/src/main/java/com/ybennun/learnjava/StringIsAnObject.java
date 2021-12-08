package com.ybennun.learnjava;

public class StringIsAnObject {


    public static void main(String[] args) {
        int a = 12;
        String myString = "Hello There";
        boolean isEmpty = myString.isEmpty();
        boolean contains = myString.contains("h");

        if (contains) {
            System.out.println("Yes contain h");
        } else {
            System.out.println("No contain h");
        }

        if (!isEmpty) {
            System.out.println(myString);
        } else {
            System.out.println("Is Empty");
        }
    }


}
