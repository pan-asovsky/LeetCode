package dev.panasovsky.exam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class LC1491EasyTest {

    private final LC1491Easy lc = new LC1491Easy();

    @Test
    void average() {

        final int[] salary = new int[] {5000, 15000, 2000, 7000, 3000};
        final double average = lc.average(salary);
        Assertions.assertEquals(average, 5000d);
    }

}