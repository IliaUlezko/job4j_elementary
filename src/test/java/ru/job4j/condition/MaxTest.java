package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void when3To4Then4() {
        int left = 3;
        int right = 4;
        int result = Max.max(left, right);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void when7To5Then7() {
        int left = 7;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void when3To3ThenEquals() {
        int left = 3;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void when3To5To7Then7() {
        int a = 3;
        int b = 5;
        int c = 7;
        int result = Max.max(a, b, c);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void when7To5To7Then7() {
        int a = 7;
        int b = 5;
        int c = 7;
        int result = Max.max(a, b, c);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void when3To5To7To11Then11() {
        int a = 3;
        int b = 5;
        int c = 7;
        int d = 11;
        int result = Max.max(a, b, c, d);
        int expected = 11;
        Assert.assertEquals(result, expected);
    }
}