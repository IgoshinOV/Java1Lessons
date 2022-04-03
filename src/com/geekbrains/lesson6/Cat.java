package com.geekbrains.lesson6;

public class Cat extends Animal {
    protected static int counterCats;

    public Cat(String name) {
        super(name);
        counterCats++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println("Кот " + printName() + " пробегает " + distance + " метров.");
        } else {
            System.out.println("Кот " + printName() + " не может пробежать дистанцию в " + distance + " метров.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот " + printName() + " не умеет плавать.");

    }
}
