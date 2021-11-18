package com.ybennun.learnjava;

public class IfBranching {
    public static void main(String[] args) {

        int a = 90;
        int b = 10;
        boolean isTall = true;

        /*

         = --> assignment

         ---Relational Operators---
         == --> comparison
         != --> NOT equal
         < - Less than
         > - Greater then
         <= - Less or equal than
         >= - Greater or equal then

         ---Logical Operators---
         ! --> NOT/Negative.

        */

        if (a == b) {
            System.out.println("Running");
        } else {
            System.out.println("Keep running...");
        }

        if (a != b) {
            System.out.println("Running");
        } else {
            System.out.println("Keep running...");
        }

        if (isTall) {
            System.out.println("True...");
        } else {
            System.out.println("Not true...");
        }

        if (!isTall) {
            System.out.println("True...");
        } else {
            System.out.println("Not true...");
        }

        if (a<b) {
            System.out.println("True...");
        } else {
            System.out.println("Not true...");
        }

        if (a>b) {
            System.out.println("True...");
        } else {
            System.out.println("Not true...");
        }
    }
}
