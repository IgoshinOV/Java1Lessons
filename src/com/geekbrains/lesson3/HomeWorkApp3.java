package com.geekbrains.lesson3;

import java.util.Arrays;

public class HomeWorkApp3 {

    public static void main(String[] args) {

        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        System.out.println(Arrays.toString(returnArray(4, 1)));
        findMaxMin();
        int[] balance = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(checkBalance(balance));
        int[] arrays = {1, 2, 3, 4, 5, 6, 7};
        swapArray(arrays, -1);
    }

    public static void invertArray() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void changeArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void fillDiagonal() {
        int[][] array = new int[6][6];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][i] = 1;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] returnArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    public static void findMaxMin() {
        int[] array = {1, -5, 3, 2, 11, 4, 5, 2, 4, -8, 9, 1};
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max = " + max + ", min = " + min + ".");
    }

    public static boolean checkBalance(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        sum = sum / 2;
        int sum1 = 0;
        for (int j : array) {
            sum1 += j;
            if (sum1 == sum) {
                return true;
            }
        }
        return false;
    }

    public static void swapArray(int[] array, int n) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int var = array[array.length - 1];
                for (int j = array.length - 1; j > 0; j--) {
                    array[j] = array[j - 1];
                }
                array[0] = var;
            }
        } else {
            for (int i = 0; i > n; i--) {
                int var = array[0];
                for (int j = 1; j < array.length; j++) {
                    array[j - 1] = array[j];
                }
                array[array.length - 1] = var;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
