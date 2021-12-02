package com.ybennun.jconstructors;

public class Hero extends Person {
    public int power;


    public Hero(String name, int age, int power) {
        super(name, age);
        this.power = power;
    }
}
