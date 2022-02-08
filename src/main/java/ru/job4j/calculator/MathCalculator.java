package ru.job4j.calculator;

import ru.job4j.math.MathFunction;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return ru.job4j.math.MathFunction.sum(first, second)
                + ru.job4j.math.MathFunction.multiply(first, second);
    }

    public static double differenceAndDivision(double a, double b) {
        return MathFunction.difference(a, b)
                + MathFunction.division(a, b);
    }

    public static double sumAll(double a, double b) {
        return MathFunction.sum(a, b)
                + MathFunction.multiply(a, b)
                + MathFunction.difference(a, b)
                + MathFunction.division(a, b);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + differenceAndDivision(40, 20));
        System.out.println("Результат расчета равен: " + sumAll(15, 5));
    }
}
