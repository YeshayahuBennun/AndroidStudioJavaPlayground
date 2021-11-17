package com.ybennun.learnjava;

public class MyClass {
    public static void main(String[] args) {
        double a = 12;
        double b = 8;

        //casting
        int sum = (int) (a + b);
        int diff = (int) (a - b);
        int mult = (int) (a*b);

        //the variable needs to be a double type.
        double quot = a/b;

        //Remainder = % --> "what remains .."

        double remainder = a%b;

        System.out.println("The remainder: " + remainder);
        System.out.println("This sum is: " + sum);
        System.out.println("This difference is: " + diff);
        System.out.println("This product is: " + mult);
        System.out.println("This quotient is: " + quot);




        /*
        LONG COMMENT
        */
  /*      String name = "Carlos";
        int age = 23;
        int year = 1988989898; // 32 bits
        long bigNumber = 198898989889899L; //64 bits bigger than 10 digits but is necessary to put the type L in the end.
        float celsius = 45.9f;// Decimal float number with 32 bits.As well here we need to put the type in the end f.
        double height = 5.9;// Decimal float number with 64 bits. And we don't need to put the type in the end.
        byte myByte = 127; // 8 bits -  A byte number can hold a maximum value of 127 or -128.
        short myShort = 190; //16 bits.
        char  letter = 'C';// One character only 'A'. Holds 16 bits. with single quotes.
        boolean isTall = true; //A Boolean number only can be true or false , 1 or 0.

        System.out.println("Hello my name is " + name + " and I'm " + age + " years old");
        System.out.println(bigNumber);

        //First Category
        //boolean and char

        *//*Second category
         * Numeric
         *   - byte
         *   - short
         *   - int
         *   - long
         * Floating point
         *   - float
         *   - double*/

    }
}