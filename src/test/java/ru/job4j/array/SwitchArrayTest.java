package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap2to4() {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int source = 2;
        int dest = 4;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 5, 4, 3, 6, 7};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap4to8() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 88, 99, 14, 32};
        int source = 4;
        int dest = 8;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 3, 4, 99, 6, 7, 88, 5, 14, 32};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap2to3() {
        int[] input = {99, 100, 101, 102, 103, 104};
        int source = 2;
        int dest = 3;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {99, 100, 102, 101, 103, 104};
        Assert.assertArrayEquals(expected, result);
    }
}