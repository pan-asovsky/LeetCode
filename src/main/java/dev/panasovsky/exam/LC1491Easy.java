package dev.panasovsky.exam;

import java.util.Arrays;


/**
 * {@see <a href="https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/">Task at LeetCode</a>}
 */
public class LC1491Easy {

    public double average(final int[] salary) {

        final int max = Arrays.stream(salary).max().getAsInt();
        final int min = Arrays.stream(salary).min().getAsInt();
        final int maxMinSum = max + min;

        final int sum = Arrays.stream(salary).sum();
        final double averageSum = sum - maxMinSum;
        final int averageSize = salary.length - 2;

        return averageSum / averageSize;
    }

}