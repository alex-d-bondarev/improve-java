package org.example.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class TestRomanToInteger {
    @Test
    public void testSingleNumbersWithMap(){
        var conv = new RomanToInteger();
        Assert.assertEquals(1, conv.romanToIntWithMap("I"));
        Assert.assertEquals(5, conv.romanToIntWithMap("V"));
        Assert.assertEquals(10, conv.romanToIntWithMap("X"));
        Assert.assertEquals(50, conv.romanToIntWithMap("L"));
        Assert.assertEquals(100, conv.romanToIntWithMap("C"));
        Assert.assertEquals(500, conv.romanToIntWithMap("D"));
        Assert.assertEquals(1000, conv.romanToIntWithMap("M"));
    }

    @Test
    public void testPairNumbersWithMap(){
        var conv = new RomanToInteger();
        Assert.assertEquals(4, conv.romanToIntWithMap("IV"));
        Assert.assertEquals(9, conv.romanToIntWithMap("IX"));
        Assert.assertEquals(40, conv.romanToIntWithMap("XL"));
        Assert.assertEquals(90, conv.romanToIntWithMap("XC"));
        Assert.assertEquals(400, conv.romanToIntWithMap("CD"));
        Assert.assertEquals(900, conv.romanToIntWithMap("CM"));
    }

    @Test
    public void testExamplesWithMap(){
        var conv = new RomanToInteger();
        Assert.assertEquals(3, conv.romanToIntWithMap("III"));
        Assert.assertEquals(58, conv.romanToIntWithMap("LVIII"));
        Assert.assertEquals(1994, conv.romanToIntWithMap("MCMXCIV"));
    }
    @Test
    public void testSingleNumbers(){
        var conv = new RomanToInteger();
        Assert.assertEquals(1, conv.romanToInt("I"));
        Assert.assertEquals(5, conv.romanToInt("V"));
        Assert.assertEquals(10, conv.romanToInt("X"));
        Assert.assertEquals(50, conv.romanToInt("L"));
        Assert.assertEquals(100, conv.romanToInt("C"));
        Assert.assertEquals(500, conv.romanToInt("D"));
        Assert.assertEquals(1000, conv.romanToInt("M"));
    }

    @Test
    public void testPairNumbers(){
        var conv = new RomanToInteger();
        Assert.assertEquals(4, conv.romanToInt("IV"));
        Assert.assertEquals(9, conv.romanToInt("IX"));
        Assert.assertEquals(40, conv.romanToInt("XL"));
        Assert.assertEquals(90, conv.romanToInt("XC"));
        Assert.assertEquals(400, conv.romanToInt("CD"));
        Assert.assertEquals(900, conv.romanToInt("CM"));
    }

    @Test
    public void testExamples(){
        var conv = new RomanToInteger();
        Assert.assertEquals(3, conv.romanToInt("III"));
        Assert.assertEquals(58, conv.romanToInt("LVIII"));
        Assert.assertEquals(1994, conv.romanToInt("MCMXCIV"));
    }
}
