package com.lsyiverson.leetcode;

public class Sqrt {

    public static int mySqrt(int x) {
        double mid = x / 2.0;
        double last;

        do {
            last = mid;
            mid = (mid + x / mid) / 2;
        } while (Math.abs(last - mid) > 0.1);

        return (int)mid;
    }
}
