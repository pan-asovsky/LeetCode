package dev.panasovsky.exam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LC13EasyTest {

    private final LC13Easy roman = new LC13Easy();

    @Test
    public void romanToIntTest() {

        final String firstRoman = "XXV";
        final int firstInt = roman.romanToArabicInteger(firstRoman);
        Assertions.assertEquals(firstInt, 25);

        final String secondRoman = "MMCDLXIV";
        final int secondInt = roman.romanToArabicInteger(secondRoman);
        Assertions.assertEquals(secondInt, 2464);
    }

}