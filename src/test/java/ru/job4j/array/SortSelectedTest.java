package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void whenSortArrayOf5elements() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf5element() {
        int[] data = new int[] {7, 4, 2, 9, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 4, 5, 7, 9};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf3elements() {
        int[] data = new int[] {87, 111, 99};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {87, 99, 111};
        Assert.assertArrayEquals(expected, result);
    }
}