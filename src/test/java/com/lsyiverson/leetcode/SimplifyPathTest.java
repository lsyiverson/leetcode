package com.lsyiverson.leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class SimplifyPathTest {
    @Test
    public void should_return_home_when_given_home_path() throws Exception {
        String absolute = "/home/";

        String simplify = SimplifyPath.simplifyPath(absolute);

        assertThat(simplify).isEqualTo("/home");
    }

    @Test
    public void should_return_c_when_given_path_contain_parent() throws Exception {
        String absolute = "/a/./b/../../c/";

        String simplify = SimplifyPath.simplifyPath(absolute);

        assertThat(simplify).isEqualTo("/c");
    }

    @Test
    public void should_return_root_when_given_path_beyond_root() throws Exception {
        String absolute = "/../";

        String simplify = SimplifyPath.simplifyPath(absolute);

        assertThat(simplify).isEqualTo("/");
    }

    @Test
    public void should_ignore_more_than_one_slashes() throws Exception {
        String absolute = "/home//foo";

        String simplify = SimplifyPath.simplifyPath(absolute);

        assertThat(simplify).isEqualTo("/home/foo");
    }
}