package dev.panasovsky.exam;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class PalindromeTest {

    private final Palindrome pal = new Palindrome();

    @Test
    public void firstPalindrome() {

        final int firstPalindrome = 9119;
        final boolean firstTrue = pal.isPalindrome(firstPalindrome);
        Assertions.assertTrue(firstTrue);
    }

    @Test
    public void secondPalindrome() {

        final int secondPalindrome = 22;
        final boolean secondTrue = pal.isPalindrome(secondPalindrome);
        Assertions.assertTrue(secondTrue);
    }

    @Test
    public void nonPalindrome() {

        final int nonPalindrome = 1231;
        final boolean firstFalse = pal.isPalindrome(nonPalindrome);
        Assertions.assertFalse(firstFalse);
    }

}