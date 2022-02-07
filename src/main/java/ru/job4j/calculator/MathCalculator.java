package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return ru.job4j.math.MathFunction.sum(first, second)
                + ru.job4j.math.MathFunction.multiply(first, second);
    }

    public static double differenceAndDivision(double a, double b) {
        return ru.job4j.math.MathFunction.difference(a, b)
                + ru.job4j.math.MathFunction.division(a, b);
    }

    public static double sumAll(double a, double b) {
        return ru.job4j.math.MathFunction.sum(a, b)
                + ru.job4j.math.MathFunction.multiply(a, b)
                + ru.job4j.math.MathFunction.difference(a, b)
                + ru.job4j.math.MathFunction.division(a, b);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + differenceAndDivision(40, 20));
        System.out.println("Результат расчета равен: " + sumAll(15, 5));
    }
}