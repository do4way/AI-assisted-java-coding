package io.beivy.exp.java.bloomfilter;

public class MainTester {

    public static void main(String[] args) {
        String value1 = "https://www.google.co.jp";
        String value2 = "https://github.com/";
        BloomFilter filter = new BloomFilter();
        System.out.println(filter.contains(value1));
        System.out.println(filter.contains(value2));
        filter.add(value1);
        filter.add(value2);
        System.out.println(filter.contains(value1));
        System.out.println(filter.contains(value2));

    }
}