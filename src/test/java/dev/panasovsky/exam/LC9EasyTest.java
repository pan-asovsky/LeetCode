package dev.panasovsky.exam;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class LC9EasyTest {

    private final LC9Easy lc = new LC9Easy();

    @Test
    public void firstPalindrome() {

        final int firstPalindrome = 9119;
        final boolean firstTrue = lc.isPalindrome(firstPalindrome);
        Assertions.assertTrue(firstTrue);
    }

    @Test
    public void secondPalindrome() {

        final int secondPalindrome = 22;
        final boolean secondTrue = lc.isPalindrome(secondPalindrome);
        Assertions.assertTrue(secondTrue);
    }

    @Test
    public void nonPalindrome() {

        final int nonPalindrome = 1231;
        final boolean firstFalse = lc.isPalindrome(nonPalindrome);
        Assertions.assertFalse(firstFalse);
    }

}