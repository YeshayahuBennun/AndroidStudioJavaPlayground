package com.ybennun.javasortarrays;

import java.util.Arrays;

public class JavaSortArrays {
    public static void main(String[] args) {
        int[] arr = {3, 12, 0, 1};

        String[] names = {"John", "Tonny", "Petter", "Ally"};

        System.out.println("Before sort");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        Arrays.sort(names);

        System.out.println("After sort");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("Before sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

        Arrays.sort(arr);

        System.out.println("After sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

    }
}