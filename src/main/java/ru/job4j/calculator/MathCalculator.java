package ru.job4j.calculator;

import ru.job4j.math.MathFunction;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double differenceAndDivision(double a, double b) {
        return difference(a, b)
                + division(a, b);
    }

    public static double sumAll(double a, double b) {
        return sumAndMultiply(a, b)
                + differenceAndDivision(a, b);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + differenceAndDivision(40, 20));
        System.out.println("Результат расчета равен: " + sumAll(15, 5));
    }
}
