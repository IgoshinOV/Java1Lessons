package com.geekbrains.lesson6;

public class Animal {
    protected String name;
    protected static int counterAnimals;

    public Animal(String name) {
        this.name = name;
        counterAnimals++;
    }

    public void run(int distance) {
        System.out.println(printName() + " пробежал " + distance + " метров.");
    }

    public void swim(int distance) {
        System.out.println(printName() + " проплыл " + distance + " метров.");
    }

    public String printName() {
        return name;
    }
}
