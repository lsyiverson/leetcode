package com.lsyiverson.leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.util.Lists;
import org.junit.Test;

import java.util.List;

public class PermutationsIITest {

    @Test
    public void should_get_3_array_when_given_one_two_one() throws Exception {
        int[] nums = {1, 1, 2};

        List<List<Integer>> lists = PermutationsII.permuteUnique(nums);

        assertThat(lists).hasSize(3);
        assertThat(lists).contains(
            Lists.newArrayList(1, 1, 2),
            Lists.newArrayList(1, 2, 1),
            Lists.newArrayList(2, 1, 1)
        );
    }

    @Test
    public void should_get_6_array_when_given_one_two_three() throws Exception {
        int[] nums = {1,2,3};

        List<List<Integer>> lists = PermutationsII.permuteUnique(nums);

        assertThat(lists).hasSize(6);
        assertThat(lists).contains(
            Lists.newArrayList(1,2,3),
            Lists.newArrayList(2,1,3),
            Lists.newArrayList(2,3,1),
            Lists.newArrayList(3,2,1),
            Lists.newArrayList(3,1,2),
            Lists.newArrayList(1,3,2)
        );
    }

    @Test
    public void should_get_24_array_when_given_one_two_three_four() throws Exception {
        int[] nums = {1,2,3,4};

        List<List<Integer>> lists = PermutationsII.permuteUnique(nums);

        assertThat(lists).hasSize(24);
        assertThat(lists).contains(
            Lists.newArrayList(1,2,3,4),
            Lists.newArrayList(1,2,4,3),
            Lists.newArrayList(1,3,2,4),
            Lists.newArrayList(1,3,4,2),
            Lists.newArrayList(1,4,2,3),
            Lists.newArrayList(1,4,3,2),
            Lists.newArrayList(2,1,3,4),
            Lists.newArrayList(2,1,4,3),
            Lists.newArrayList(2,3,1,4),
            Lists.newArrayList(2,3,4,1),
            Lists.newArrayList(2,4,1,3),
            Lists.newArrayList(2,4,3,1),
            Lists.newArrayList(3,1,2,4),
            Lists.newArrayList(3,1,4,2),
            Lists.newArrayList(3,2,1,4),
            Lists.newArrayList(3,2,4,1),
            Lists.newArrayList(3,4,1,2),
            Lists.newArrayList(3,4,2,1),
            Lists.newArrayList(4,1,2,3),
            Lists.newArrayList(4,1,3,2),
            Lists.newArrayList(4,2,1,3),
            Lists.newArrayList(4,2,3,1),
            Lists.newArrayList(4,3,1,2),
            Lists.newArrayList(4,3,2,1)
        );
    }
}