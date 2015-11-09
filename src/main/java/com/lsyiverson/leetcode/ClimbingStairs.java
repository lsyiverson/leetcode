package com.lsyiverson.leetcode;

public class ClimbingStairs {

    public static int climbStairs(int n) {
        int[] count = new int[n];

        count[0] = 1;

        if (n > 1) {
            count[1] = 2;
        }
        for(int i = 2; i < n; i++) {
            count[i] = count[i-1] + count[i-2];
        }

        return count[n-1];
    }

    public static int climbStairs1(int n) {
        return climb(n);
    }

    private static int climb(int stairs) {
        if (stairs == 1) {
            return 1;
        }

        if (stairs == 2) {
            return 2;
        }

        return climb(stairs - 1) + climb(stairs - 2);
    }
}
