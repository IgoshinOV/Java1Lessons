package com.geekbrains.lesson7;

public class Cat {

    private final String name;
    private final int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        if (isSatiety(plate)) {
            plate.decreaseFood(appetite);
            System.out.println(this.name + " съел " + appetite + " ед. еды, сытость " + satiety);
        } else {
            System.out.println(this.name + " не смог поесть, сытость " + satiety);
        }
    }

    public boolean isSatiety(Plate plate) {
        if (plate.isFoodEnough(appetite)) {
            return satiety = true;
        } else {
            return satiety = false;
        }
    }
}
