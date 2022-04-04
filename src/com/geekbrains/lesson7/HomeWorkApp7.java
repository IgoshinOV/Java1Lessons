package com.geekbrains.lesson7;

public class HomeWorkApp7 {

    public static void main(String[] args) {
        Cat[] cats = new Cat[]{
                new Cat("Nuf", 50),
                new Cat("Naf", 20),
                new Cat("Nif", 25)
        };
        Plate plate = new Plate(45);

        for (Cat cat : cats) {
            cat.eat(plate);
        }
    }
}

