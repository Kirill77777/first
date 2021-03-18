package ru.geekbrains.lesson1;

public class HomeWorkApp1 {

    public static void main(String[] args) {

        System.out.println("a * (b + (c / d)) = " + doOne(2, 1, 3, 4));
        System.out.println(doTwo(50, 8));
        doThree(-5);
        doFour("учитель");
    }


    static double doOne(double a, double b, double c, double d) {
        System.out.println("\nЗадание 1.");
        return a * (b + (c / d));
    }

    static boolean doTwo(int a, int b) {
        System.out.println("\nЗадание 2.");
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }

    static void doThree(int a) {
        System.out.println("\nЗадание 3.");
        if (a >= 0) System.out.println("Число " + a + "положительное");
        else System.out.println("Число " + a + " отрицательное");
    }

    static void doFour(String name) {
        System.out.println("\nЗадание 4.");
        System.out.println("Привет, " + name + "!");
    }
}
