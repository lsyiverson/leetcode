package com.lsyiverson.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PermutationsII {
    public static List<List<Integer>> result;

    public static List<List<Integer>> permuteUnique(int[] nums) {
        result = new ArrayList<>();
        permute(nums, 0);

        return result;
    }

    private static void permute(int[] nums, int start) {
        if (start == nums.length) {
            List<Integer> list = new ArrayList<>();
            for (int num : nums) {
                list.add(num);
            }
            result.add(list);
        }

        for (int i = start; i < nums.length; i++) {
            if (isSwap(nums, start, i)) {
                swap(nums, start, i);
                permute(nums, start + 1);
                swap(nums, start, i);
            }
        }
    }

    private static void swap(int[] nums, int from, int to) {
        int temp = nums[from];
        nums[from] = nums[to];
        nums[to] = temp;
    }

    private static boolean isSwap(int[] nums, int start, int end) {
        for (int i = start; i < end; i++) {
            if (nums[i] == nums[end]) {
                return false;
            }
        }
        return true;
    }
}
