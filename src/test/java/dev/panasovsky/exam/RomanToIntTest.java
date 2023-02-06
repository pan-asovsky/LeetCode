package dev.panasovsky.exam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanToIntTest {

    private final RomanToInt roman = new RomanToInt();

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