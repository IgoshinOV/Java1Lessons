package com.geekbrains.lesson6;

public class Dog extends Animal {
    protected static int counterDogs;

    public Dog(String name) {
        super(name);
        counterDogs++;
    }

    public void run(int distance) {
        if (distance <= 500) {
            System.out.println("Пес " + printName() + " пробегает " + distance + " метров.");
        } else {
            System.out.println("Пес " + printName() + " не может пробежать дистанцию в " + distance + " метров.");
        }
    }

    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println("Пес " + printName() + " проплывает " + distance + " метров.");
        } else {
            System.out.println("Пес " + printName() + " не может проплыть дистанцию в " + distance + " метров.");
        }
    }
}
