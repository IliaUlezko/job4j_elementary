package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00To30Then3() {
        Point a = new Point(0, 0);
        Point b = new Point(3, 0);
        int expected = 3;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10To17Then7() {
        Point a = new Point(1, 0);
        Point b = new Point(1, 7);
        int expected = 7;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11To45Then5() {
        Point a = new Point(1, 1);
        Point b = new Point(4, 5);
        int expected = 5;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when222To555Then5Dot2() {
        Point a = new Point(2, 2, 2);
        Point b = new Point(5, 5, 5);
        double expected = 5.2;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000To747Then10Dot68() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(7, 4, 7);
        double expected = 10.68;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}