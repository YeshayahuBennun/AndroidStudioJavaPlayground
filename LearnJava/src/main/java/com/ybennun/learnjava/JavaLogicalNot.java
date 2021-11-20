package com.ybennun.learnjava;

public class JavaLogicalNot {
    public static void main(String[] args) {
        boolean isFunny = true;
        int age = 23;

        if(!isFunny){
            System.out.println("Not Funny");
        }else{
            System.out.println("Funny");
        }

        if(!(age>10) || (isFunny==true) && (age<89)){

        }else {
            System.out.println("Not true");
        }
    }
}
