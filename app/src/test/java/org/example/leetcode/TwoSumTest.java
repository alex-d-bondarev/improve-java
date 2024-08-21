package org.example.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {

    @Test public void test2SameNumbers(){
        int target = 2;
        int[] input = new int[] {1, 1};
        int[] expected = new int[] {0, 1};
        Assert.assertArrayEquals(expected, new TwoSum().twoSum(input, target));
    }

    @Test public void test2DifferentNumbers(){
        int target = 3;
        int[] input = new int[] {1, 2};
        int[] expected = new int[] {0, 1};
        Assert.assertArrayEquals(expected, new TwoSum().twoSum(input, target));
    }

    @Test public void test3DifferentNumbers(){
        int target = 4;
        int[] input = new int[] {1, 2, 3};
        int[] expected = new int[] {0, 2};
        Assert.assertArrayEquals(expected, new TwoSum().twoSum(input, target));
    }

    @Test public void testExample1(){
        int target = 9;
        int[] input = new int[] {2, 7, 11, 15};
        int[] expected = new int[] {0, 1};
        Assert.assertArrayEquals(expected, new TwoSum().twoSum(input, target));
    }

    @Test public void testExample2(){
        int target = 6;
        int[] input = new int[] {3, 2, 4};
        int[] expected = new int[] {1, 2};
        Assert.assertArrayEquals(expected, new TwoSum().twoSum(input, target));
    }

    @Test public void testExample3(){
        int target = 6;
        int[] input = new int[] {3, 3};
        int[] expected = new int[] {0, 1};
        Assert.assertArrayEquals(expected, new TwoSum().twoSum(input, target));
    }
}
