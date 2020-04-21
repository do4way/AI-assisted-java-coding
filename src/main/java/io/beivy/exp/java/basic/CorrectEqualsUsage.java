package io.beivy.exp.java.basic;

public class CorrectEqualsUsage {

    public boolean isFoo(String str) {
        return str.equals("foo");
    }

    public static void main(String[] args) {
        CorrectEqualsUsage usage = new CorrectEqualsUsage();
        System.out.println(usage.isFoo("abc"));
    }
}
