package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00To30Then3() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 3;
        int y2 = 0;
        int expected = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10To17Then7() {
        int x1 = 1;
        int y1 = 0;
        int x2 = 1;
        int y2 = 7;
        int expected = 7;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11To45Then5() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 4;
        int y2 = 5;
        int expected = 5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}