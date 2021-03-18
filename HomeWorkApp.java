package ru.geekbrains.lesson1;

public class HomeWorkApp {

    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
                
    }

    private static void printThreeWords() {

        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }

    private static void checkSumSign() {

        int a = 3;
        int b = -6;
        int result = a + b;

        if (result >= 0) {
            System.out.println("Сумма положительная");
        }

        if (result < 0) {
            System.out.println("Сумма отрицательная");
        }
    }
    private static void printColor() {

        int value = 85;

        if (value <= 0) {
            System.out.println("Красный");
        }

        if (value > 100) {
            System.out.println("Зеленый");
        }
        else {
            System.out.println("Желтый");
        }
    }

    private static void compareNumbers() {

            int a = -5;
            int b = -4;

            if (a >= b) {
                System.out.println("a >= b");
            } else if (a < b) {
                System.out.println("a < b");
            }
        }

    }



