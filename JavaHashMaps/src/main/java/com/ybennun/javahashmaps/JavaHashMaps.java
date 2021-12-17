package com.ybennun.javahashmaps;

import java.util.HashMap;

public class JavaHashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> gamesStats = new HashMap<>();

        gamesStats.put("James", 100);
        gamesStats.put("Ruth", 457);
        gamesStats.put("Carolina", 679);

        //gamesStats.clear();
        gamesStats.remove("James");

        System.out.println(gamesStats.get("Ruth"));
        System.out.println(gamesStats);
        System.out.println(gamesStats.size());

        //loop for key
        for (String item : gamesStats.keySet()) {
            System.out.println(item);
        }

        //Loop for values
        for (Integer item : gamesStats.values()) {
            System.out.println(item);
        }

        //Loop for key value
        for (String item : gamesStats.keySet()) {
            System.out.println("key: " + item + " value: " + gamesStats.get(item));
        }
    }
}
