package com.lsyiverson.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        int start = -1;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                int length = i - Math.max(map.get(s.charAt(i)), start);
                max = Math.max(length, max);
                start = Math.max(map.get(s.charAt(i)), start);
            } else {
                int length = i - start;
                max = Math.max(length, max);
            }
            map.put(s.charAt(i), i);
        }

        return max;
    }

    public static int lengthOfLongestSubstring0(String s) {
        int max = 0;
        for (int i = 0; i < s.length() && s.length() - i > max; i ++) {
            int j = i + 1;
            for (; j <= s.length(); j++) {
                String substring = s.substring(i, j);
                if (j + 1 > s.length()) {
                    if (max < substring.length()) {
                        max = substring.length();
                    }
                    i = j;
                    break;
                }
                if (j == s.length() || substring.contains(String.valueOf(s.charAt(j)))) {
                    if (max < substring.length()) {
                        max = substring.length();
                    }
                    break;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        LongestSubstring.lengthOfLongestSubstring("");
    }
}
