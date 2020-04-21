package io.beivy.exp.java.basic;

import java.math.BigDecimal;

public class CorrectEqualsUsage {

    public boolean isEquals(float data, float anotherData) {
        return data == anotherData;
    }

    public boolean isFoo(String str) {
        return str.equals("foo");
    }

    public static void main(String[] args) {
        CorrectEqualsUsage usage = new CorrectEqualsUsage();
        System.out.println(usage.isFoo("abc"));

        System.out.println(usage.isEquals((1.0f - 0.9f), (0.9f - 0.8f)));

    }
}
