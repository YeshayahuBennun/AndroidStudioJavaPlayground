package com.ybennun.arraylist;

public class ArraysAsMethodsParameters {
    public static void main(String[] args) {
        int[] numbers = {12, 0, 34, 100, 34, 2, 3, 5, 10, 78, 69, 12349,89,76,100000,87654};

        findMultThree(numbers);
    }

    public static void findMultThree(int[] nums) {
        if (nums.length > 0) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] % 3 == 0) {
                    System.out.println(nums[i] + " is a multiple of 3");
                } else {
                    System.out.println("x " + nums[i] + " is not a multiple of 3");
                }
            }
        } else {
            System.out.println("Empty Array");
        }
    }
}
