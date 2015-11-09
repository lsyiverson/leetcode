package com.lsyiverson.leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class SqrtTest {

    @Test
    public void should_get_3_when_given_13() throws Exception {
        int num = 13;

        int result = Sqrt.mySqrt(num);

        assertThat(result).isEqualTo(3);
    }
}