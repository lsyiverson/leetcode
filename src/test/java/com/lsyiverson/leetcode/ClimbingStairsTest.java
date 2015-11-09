package com.lsyiverson.leetcode;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class ClimbingStairsTest {

    @Test
    public void should_only_one_way_to_climb_one_stair() throws Exception {
        int n = 1;

        int ways = ClimbingStairs.climbStairs(n);

        assertThat(ways).isEqualTo(1);
    }

    @Test
    public void should_two_ways_to_climb_two_stairs() throws Exception {
        int n = 2;

        int ways = ClimbingStairs.climbStairs(n);

        assertThat(ways).isEqualTo(2);
    }

    @Test
    public void should_three_ways_to_climb_three_stairs() throws Exception {
        int n = 3;

        int ways = ClimbingStairs.climbStairs(n);

        assertThat(ways).isEqualTo(3);
    }

    @Test
    public void should_five_ways_to_climb_four_stairs() throws Exception {
        int n = 4;

        int ways = ClimbingStairs.climbStairs(n);

        assertThat(ways).isEqualTo(5);
    }

    @Test
    public void should_in_time_limit_when_climb_44_stairs() throws Exception {
        int n = 44;

        long startTime = System.currentTimeMillis();
        int ways = ClimbingStairs.climbStairs(n);
        long endTime = System.currentTimeMillis();

        assertThat(ways).isEqualTo(1134903170);
        assertThat(endTime - startTime).isLessThan(200);
    }
}