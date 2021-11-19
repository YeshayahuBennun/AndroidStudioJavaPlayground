package com.ybennun.learnjava;

public class JavaLogicalOR {
    public static void main(String[] args) {
        int a = 12;
        int b = 11;
        boolean isSnowing = false;

        // || OR
        if((a>b)||(isSnowing==false)&&(a<78)){
            System.out.println("True since one or both conditions are true");
        }else {
            System.out.println("False since both conditions are false");
        }
    }
}
