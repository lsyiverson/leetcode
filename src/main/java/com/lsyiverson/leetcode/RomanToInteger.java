package com.lsyiverson.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = map.get(s.charAt(0));
        for(int i = 0; i < s.length() - 1; i++) {
            int front = map.get(s.charAt(i));
            int behind = map.get(s.charAt(i + 1));

            if (behind > front) {
                sum = sum - front + (behind - front);
            } else {
                sum = sum + behind;
            }
        }
        return sum;
    }
}
