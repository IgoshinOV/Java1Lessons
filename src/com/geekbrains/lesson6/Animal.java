package com.geekbrains.lesson6;

public class Animal {
    protected String name;
    protected static int counterAnimals;

    public Animal(String name) {
        this.name = name;
        counterAnimals++;
    }

    public String printName() {
        return name;
    }
}
