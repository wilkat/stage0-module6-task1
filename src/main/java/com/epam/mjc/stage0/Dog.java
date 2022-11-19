package com.epam.mjc.stage0;

public class Dog extends Animal{

    public Dog(String color, int numberOfPaws, boolean hasFur) {
        super("brown", 4, true);
    }

    public static void main(String[] args) {
        Dog burek = new Dog("brown", 4, true);
        System.out.println(burek.getDescription());
    }
}
