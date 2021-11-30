package com.ybennun.learnjava;

public class Microphone {
    //instance variables/properties/fields
    String name;
    String color;
    int model;

    //Actions methods
    public void turnOff() {
        System.out.println(this.name + " Turning off");
    }

    public void turnOn() {
        System.out.println(this.name + " Turning on");
    }

    public void setVolume() {
        System.out.println(this.name + " Setting volume");
    }

    public String showDescription() {
        return "Microphone name " + this.name + " with color: " + this.color + " and its model " + this.model;
    }


}
