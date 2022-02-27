package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
       int rsl = left > right ? left : right;
       return rsl;
    }
}

class MaxTest {

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = Max.max(a, b);
        System.out.println(c);
        a = 5;
        b = 2;
        c = Max.max(a, b);
        System.out.println(c);
        a = 4;
        b = 4;
        c = Max.max(a, b);
        System.out.println(c);
    }
}
