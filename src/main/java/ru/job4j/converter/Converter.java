package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;

    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed =  out ==  expected;
        System.out.println("140 rubles are " + out + " euro.Test result: " + passed);
        float r = 1800;
        float d = 30;
        float rsl = Converter.rubleToDollar(r);
        boolean p = rsl == d;
        System.out.println("1800 rubles are " + rsl + " dollars.Test result: " + p);
    }
}
