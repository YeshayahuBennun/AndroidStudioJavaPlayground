package com.ybennun.learnjava;

public class JavaLogicalElseIf {
    public static void main(String[] args) {
        char grade = 'F';

        if(grade =='A'){
            System.out.println("A is for Awesome!");
        }else if(grade =='B'){
            System.out.println("B is b for Beautifully done!");
        }else if(grade == 'C'){
            System.out.println("C is for Careless!");
        } else if (grade == 'F') {
            System.out.println("F is for future unknown");
        }
    }
}
