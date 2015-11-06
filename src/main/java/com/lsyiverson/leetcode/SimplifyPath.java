package com.lsyiverson.leetcode;

import java.util.Stack;

public class SimplifyPath {

    public static String simplifyPath(String path) {
        StringBuilder builder = new StringBuilder();
        String[] uris = path.split("/");
        for (String uri : uris) {
            switch (uri) {
                case "":
                case ".":
                    break;
                case "..":
                    if (builder.length() != 0) {
                        builder.replace(builder.lastIndexOf("/"), builder.length(), "");
                    }
                    break;
                default:
                    builder.append("/").append(uri);
                    break;
            }
        }
        if (builder.length() == 0) {
            builder.append("/");
        }
        return builder.toString();
    }

    public static String simplifyPath1(String path) {
        Stack<String> stack = new Stack<>();
        String[] uris = path.split("/");
        for (String uri : uris) {
            switch (uri) {
                case "":
                case ".":
                    break;
                case "..":
                    if (!stack.empty()) {
                        stack.pop();
                    }
                    break;
                default:
                    stack.push(uri);
                    break;
            }
        }

        StringBuilder simplify = new StringBuilder();
        if (stack.empty()) {
            simplify.append("/");
        } else {
            stack.stream().forEach(uri -> simplify.append("/").append(uri));
        }

        return simplify.toString();
    }
}
