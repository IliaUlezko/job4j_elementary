package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double rsl = p / (2 * (k + 1));
        return rsl;
    }

    public static double length(double h, double k) {
        double rsl1 = h * k;
        return rsl1;
    }

    public static double square2(double l, double h) {
        double rsl2 = l * h;
        return rsl2;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
        double result12 = SqArea.length(result1, 1);
        System.out.println(" Lenght equals " + result12);
        double result13 = SqArea.square2(result12, result1);
        System.out.println(" The square equals " + result13);
        System.out.println();
        double result2 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, real = " + result2);
        double result22 = SqArea.length(result2, 2);
        System.out.println(" Length equals " + result22);
        double result23 = SqArea.square2(result22, result2);
        System.out.println(" The square equals " + result23);
    }
}
