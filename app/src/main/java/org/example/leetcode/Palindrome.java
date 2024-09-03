package org.example.leetcode;

public class Palindrome {
    public boolean isPalindrome(int x) {
        var reversed = 0;
        var num_copy = x;
        while (num_copy > 0) {
            reversed = reversed * 10 + num_copy % 10;
            num_copy = num_copy / 10;
        }
        return reversed == x;
    }
}
