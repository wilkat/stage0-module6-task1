package com.epam.mjc.stage0;

public class Dog extends Animal{

    Dog() {
        super("brown", 4, true);
    }

    public static void main(String[] args) {
        Dog burek = new Dog();
        System.out.println(burek.getDescription());
    }
}
