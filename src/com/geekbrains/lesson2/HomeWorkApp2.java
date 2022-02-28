package com.geekbrains.lesson2;

public class HomeWorkApp2 {

    public static void main(String[] args) {

        System.out.println(compareNumbers(10, 3));
        printIsNegativeNumber(-10);
        System.out.println(isNegativeNumber(5));
        printString("GO", 3);
        System.out.println(leapYear(2022));
    }

    public static boolean compareNumbers(int a, int b) {

        int sum = a + b;
        if (sum >= 10) {
            if (sum <= 20) {
                return true;
            }
        }
        return false;
    }

    public static void printIsNegativeNumber(int number) {

        if (number < 0) {
            System.out.println("Число отрицательное!");
        } else {
            System.out.println("Число положительное!");
        }
    }

    public static boolean isNegativeNumber(int a) {
        if (a < 0) {
            return true;
        }
        return false;
    }

    public static void printString(String str, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(str);
        }
    }

    public static boolean leapYear(int year) {
        if (year % 4 != 0) {
            System.out.println("Год обычный");
            return false;
        } else if (year % 100 == 0 && year % 400 != 0) {
            System.out.println("Год обычный");
            return false;
        }
        System.out.println("Год високосный");
        return true;
    }
}
