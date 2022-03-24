package com.geekbrains.lesson4;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp4 {

    public static final int SIZE = 5;
    public static final int DOT_TO_WIN = 4;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map = new char[SIZE][SIZE];

    public static void main(String[] args) {

        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (isWin(DOT_X)) {
                System.out.println("Человек победил!");
                break;
            }
            if (isMapFull()) {
                break;
            }
            compTurn();
            printMap();
            if (isWin(DOT_O)) {
                System.out.println("Компьютер победил!");
                break;
            }
            if (isMapFull()) {
                break;
            }
        }
    }

    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static boolean isValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            System.out.println("Данные введены некорректно.");
            return false;
        }
        if (map[y][x] == DOT_EMPTY) {
            return true;
        }
        System.out.println("Клетка уже занята.");
        return false;
    }

    private static void humanTurn() {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y от 1 до 5.");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isValid(x, y));
        map[y][x] = DOT_X;
    }

    private static void compTurn() {
        int[] cell = emptyCell(DOT_O);
        if (cell == null) {
            cell = emptyCell(DOT_X);
            if (cell == null) {
                cell = randomMove();
            }
        }
        int x = cell[0];
        int y = cell[1];
        map[x][y] = DOT_O;
    }

    private static int[] emptyCell(char symbol) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY && isWinSell(i, j, symbol)) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    private static boolean isWinSell(int x, int y, char symbol) {
        map[x][y] = symbol;
        boolean result = isWin(symbol);
        map[x][y] = DOT_EMPTY;
        return result;
    }


    private static int[] randomMove() {
        int x;
        int y;
        Random random = new Random();
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (map[x][y] != DOT_EMPTY);
        return new int[]{x, y};

    }

    private static boolean isWin(char symbol) {
        if (checkRowsAndColumns(symbol)) {
            return true;
        } else return checkDiagonals(symbol);
    }

    private static boolean checkRowsAndColumns(char symbol) {
        for (int i = 0; i < SIZE; i++) {
            int rowCounter = 0;
            int colCounter = 0;
            for (int j = 0; j < SIZE; j++) {
                rowCounter = map[i][j] == symbol ? rowCounter + 1 : 0;
                colCounter = map[j][i] == symbol ? colCounter + 1 : 0;
                if (rowCounter == DOT_TO_WIN || colCounter == DOT_TO_WIN) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkDiagonals(char symbol) {
        int mainDiagonals = 0;
        int saidDiagonals = 0;
        for (int i = 0; i < SIZE; i++) {
            if (map[i][i] == symbol) {
                mainDiagonals++;
            } else {
                mainDiagonals = 0;
            }
            if (map[i][map.length - 1 - i] == symbol) {
                saidDiagonals++;
            } else {
                saidDiagonals = 0;
            }
            if (mainDiagonals == DOT_TO_WIN || saidDiagonals == DOT_TO_WIN) {
                return true;
            }
        }
        return false;
    }

    private static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        System.out.println("Ничья!");
        return true;
    }
}
