package com.geekbrains.lesson6;

public class HomeWorkApp6 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Ric");
        Cat cat2 = new Cat("Jo");
        Cat cat3 = new Cat("lo");
        Dog dog1 = new Dog("Jec");

        cat1.run(150);
        cat2.run(300);
        cat3.swim(20);
        dog1.swim(7);
        printNumberOfOrders();
    }

    public static void printNumberOfOrders() {
        System.out.println("Общее количество созданных животных " + Animal.counterAnimals);
        System.out.println("Количество созданных котов " + Cat.counterCats);
        System.out.println("Количество созданных собак " + Dog.counterDogs);
    }
}
