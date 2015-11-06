package com.lsyiverson.leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class LongestSubstringTest {

    @Test
    public void should_get_3_when_given_abcabcbb() throws Exception {
        String given = "abcabcbb";

        int result = LongestSubstring.lengthOfLongestSubstring(given);

        assertThat(result).isEqualTo(3);
    }

    @Test
    public void should_get_1_when_given_bbbbbb() throws Exception {
        String given = "bbbbbb";

        int result = LongestSubstring.lengthOfLongestSubstring(given);

        assertThat(result).isEqualTo(1);
    }

    @Test
    public void should_get_1_when_given_c() throws Exception {
        String given = "c";

        int result = LongestSubstring.lengthOfLongestSubstring(given);

        assertThat(result).isEqualTo(1);
    }

    @Test
    public void should_get_0_when_given_empty() throws Exception {
        String given = "";

        int result = LongestSubstring.lengthOfLongestSubstring(given);

        assertThat(result).isEqualTo(0);
    }

    @Test
    public void should_get_2_when_given_au() throws Exception {
        String given = "au";

        int result = LongestSubstring.lengthOfLongestSubstring(given);

        assertThat(result).isEqualTo(2);
    }

    @Test
    public void should_get_2_when_given_aab() throws Exception {
        String given = "aab";

        int result = LongestSubstring.lengthOfLongestSubstring(given);

        assertThat(result).isEqualTo(2);
    }

    @Test
    public void should_get_2_when_given_abba() throws Exception {
        String given = "abba";

        int result = LongestSubstring.lengthOfLongestSubstring(given);

        assertThat(result).isEqualTo(2);
    }

    @Test
    public void should_get_3_when_given_dvdf() throws Exception {
        String given = "dvdf";

        int result = LongestSubstring.lengthOfLongestSubstring(given);

        assertThat(result).isEqualTo(3);
    }

    @Test
    public void should_get_3_when_given_ggububgvfk() throws Exception {
        String given = "ggububgvfk";

        int result = LongestSubstring.lengthOfLongestSubstring(given);

        assertThat(result).isEqualTo(6);
    }
}