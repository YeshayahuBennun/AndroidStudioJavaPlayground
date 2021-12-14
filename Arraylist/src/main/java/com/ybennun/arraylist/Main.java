package com.ybennun.arraylist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> name = new ArrayList();
        name.add("Bond");
        name.add("James");
        name.add("Bonni");
        name.add("Arnold");

        for (int i = 0; i < name.size(); i++) {
            System.out.println("Names: " + name.get(i));
        }

        //Clever for loop
        for (Object n : name) {
            System.out.println(n);
        }

        System.out.println(name.get(0));
    }
}