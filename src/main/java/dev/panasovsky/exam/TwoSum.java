package dev.panasovsky.exam;

import java.util.Map;
import java.util.HashMap;


public class TwoSum {

    // O(n)
    public int[] twoSum(final int[] nums, final int target) {

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