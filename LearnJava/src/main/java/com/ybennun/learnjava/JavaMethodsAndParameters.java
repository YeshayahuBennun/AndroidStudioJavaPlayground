package com.ybennun.learnjava;

import com.sun.tools.javac.comp.Todo;

public class JavaMethodsAndParameters {
    public static void main(String[] args) {
        myName("Paulo");
        System.out.println(addNumbers(12, 12));
        anotherMethod("Hello", 23);
        showName();
        System.out.println(showFullName("George", "The man"));
        System.out.println(showChar('B'));
    }

    // TODO: 26/11/2021 create a multiplyNumbers(),divideNumbers()...
    public static void myName(String mName) {
        System.out.println(mName);
    }

    //Return a integer
    public static int addNumbers(int a, int b) {
        int sum = a + b;
        int result = sum;
        System.out.println("Sum is: " + sum);

        return sum; //(a+b)
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

    //Return a string
    public static String showFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    //Return a Character
    public static char showChar(char c) {
        return c;
    }
}
