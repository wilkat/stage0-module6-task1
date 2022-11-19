package com.epam.mjc.stage0;

public class Animal {

    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {

        String prefix = (hasFur == true)? "a": "no";
        String paws = numberOfPaws == 1? "paw": "paws";

        return "This animal is mostly " + color +". It has " + numberOfPaws + " " + paws + " and " +
                prefix + " fur.";
    }
}
