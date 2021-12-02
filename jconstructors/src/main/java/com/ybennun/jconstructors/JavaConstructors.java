package com.ybennun.jconstructors;

public class JavaConstructors {
    public static void main(String[] args) {
        Person person = new Person("James", 56);
        System.out.println(person.age);

        Hero superman = new Hero("Superman",33,345);
        System.out.println(superman.power);
    }
}