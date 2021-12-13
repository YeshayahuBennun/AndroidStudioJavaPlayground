package com.ybennun.arraylist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList name = new ArrayList();
        name.add(1);
        name.add("Hello");
        System.out.println(name);
        name.add(2);
        System.out.println(name);
        name.remove(2);
        System.out.println(name);
    }
}