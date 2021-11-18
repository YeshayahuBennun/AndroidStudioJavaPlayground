package com.ybennun.learnjava;

public class JavaLogicalAND {
    public static void main(String[] args) {
        int age = 18;
        boolean isCitizen = true;
        boolean notFelon =false;

        if((age>=10)&&(isCitizen)&&(notFelon)){
            System.out.println("Can vote!");
        }else {
            System.out.println("Can't vote!");
        }
    }

}
