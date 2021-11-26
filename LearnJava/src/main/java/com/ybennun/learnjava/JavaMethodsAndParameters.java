package com.ybennun.learnjava;

import com.sun.tools.javac.comp.Todo;

public class JavaMethodsAndParameters {
    public static void main(String[] args) {
        addNumbers(12,12);
        anotherMethod("Hello", 23);
        showName();
    }

    // TODO: 26/11/2021 create a multiplyNumbers(),divideNumbers()...
    public static void addNumbers(int a, int b) {
        int sum = a+b;
        System.out.println("Sum is: " + sum);
    }

    public static void anotherMethod(String something, int age) {

        if (age < 90) {
            System.out.println("I'm still young");
        }

        System.out.println("Another Method " + something + age);
    }

    public static void showName() {
        for (int i = 0; i < 20; i++) {
            if (i % 3 == 0) {
                System.out.println(i + " is multiple of 3.");
            }
        }
        System.out.println("From showName");
    }
}
