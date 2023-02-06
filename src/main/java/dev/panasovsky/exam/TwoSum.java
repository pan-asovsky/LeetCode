package dev.panasovsky.exam;

import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;


public class TwoSum {

    public static void main(final String[] args) {

        final int[] nums = new int[] {5, 3, 1, 7, 6, 0, 9, 4};
        final int target = 14;

        final int[] twoSum = twoSum(nums, target);
        System.out.println(Arrays.toString(twoSum));
    }

    // O(n^2)
    private static int[] twoSumBrute(final int[] nums, final int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }

        return new int[] {};
    }

    // O(n)
    private static int[] twoSum(final int[] nums, final int target) {

        final Map<Integer, Integer> numToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (numToIndex.containsKey(target - nums[i])) {
                return new int[] {numToIndex.get(target - nums[i]), i};
            }
            numToIndex.put(nums[i], i);
        }

        return new int[] {};
    }

}