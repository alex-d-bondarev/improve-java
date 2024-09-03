package org.example.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class TestPalindrome {
    @Test
    public void singleNumberIsPalindrome() {
        Assert.assertTrue("1", new Palindrome().isPalindrome(1));
    }

    @Test
    public void notAPalindrome() {
        Assert.assertFalse("12345", new Palindrome().isPalindrome(12345));
    }

    @Test
    public void example1() {
        Assert.assertTrue("121", new Palindrome().isPalindrome(121));
    }

    @Test
    public void example2() {
        Assert.assertFalse("-121", new Palindrome().isPalindrome(-121));
    }

    @Test
    public void example3() {
        Assert.assertFalse("10", new Palindrome().isPalindrome(10));
    }
}
