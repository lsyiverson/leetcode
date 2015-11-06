package com.lsyiverson.leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class RomanToIntegerTest {

    @Test
    public void should_get_1_when_given_I() throws Exception {
        String roman = "I";

        int arabic = RomanToInteger.romanToInt(roman);

        assertThat(arabic).isEqualTo(1);
    }

    @Test
    public void should_get_4_when_given_IV() throws Exception {
        String roman = "IV";

        int arabic = RomanToInteger.romanToInt(roman);

        assertThat(arabic).isEqualTo(4);
    }

    @Test
    public void should_get_8_when_given_VIII() throws Exception {
        String roman = "VIII";

        int arabic = RomanToInteger.romanToInt(roman);

        assertThat(arabic).isEqualTo(8);
    }

    @Test
    public void should_get_98_when_given_XCVIII() throws Exception {
        String roman = "XCVIII";

        int arabic = RomanToInteger.romanToInt(roman);

        assertThat(arabic).isEqualTo(98);
    }
}