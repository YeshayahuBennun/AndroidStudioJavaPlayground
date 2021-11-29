package com.ybennun.learnjava;

public class MyClassOOP {
    public static void main(String[] args) {
        Microphone microphone = new Microphone();//instantiating our object.
        microphone.color = "Blue";
        microphone.name = "Blue Yeti";
        microphone.model = 133543;

        Microphone gHMic = new Microphone();

        gHMic.model = 465;
        gHMic.name = "GHZB";
        gHMic.color = "Red";


        System.out.println(microphone.name);
        System.out.println(gHMic.name);

    }
}
