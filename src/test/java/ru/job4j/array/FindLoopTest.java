package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasNot10ThenMinus1() {
       int[] ints = {1, 2, 3, 4, 16, 6};
       int el = 10;
       int result = FindLoop.indexOf(ints, el);
       int expected = -1;
       Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas4Then5() {
        int[] months = {0, 12, 1, 2, 3, 4, 5, 6};
        int el = 4;
        int result = FindLoop.indexOf(months, el);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas5Then3() {
        int[] data = {4, 3, 2, 5};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }
}