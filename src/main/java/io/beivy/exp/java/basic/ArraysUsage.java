package io.beivy.exp.java.basic;

import java.util.Arrays;
import java.util.List;

public class ArraysUsage {

    public static <T> List<T> from(T[] source) {
        return Arrays.asList(source);
    }

    public static void main(String[] args) {
        String[] testData = { "foo", "bar" };
        List<String> target = from(testData);
        target.add("another data");
    }
}