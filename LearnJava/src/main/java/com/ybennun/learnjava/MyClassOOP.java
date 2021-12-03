package com.ybennun.learnjava;

public class MyClassOOP {
    public static void main(String[] args) {
        Microphone microphone = new Microphone("Blue Yeti", "Blue", 364663);//instantiating our object.
        /*microphone.color = "Blue";
        microphone.name = "Blue Yeti";
        microphone.model = 133543;*/

        Microphone gHMic = new Microphone("GHMic", "Red", 546);

        /*gHMic.model = 465;
        gHMic.name = "GHZB";
        gHMic.color = "Red";*/

        microphone.setModel(87);
        microphone.setName("New Blue Yeti");
        microphone.setColor("Red Blue");


        System.out.println("New Mic: " + microphone.getName());
        System.out.println("New Mic: " + gHMic.getName());

        microphone.turnOn();
        microphone.setVolume();
        microphone.turnOff();

        gHMic.turnOn();
        gHMic.setVolume();
        gHMic.turnOff();

        System.out.println(microphone.showDescription());
        ;

    }
}
