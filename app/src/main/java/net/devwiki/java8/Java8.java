package net.devwiki.java8;

import java.util.Arrays;
import java.util.function.IntConsumer;

public class Java8 {
    public static void main(String[] args) {
        int[] a = {1,2};
        Arrays.stream(a).forEach(new IntConsumer() {
            @Override
            public void accept(int value) {
                System.out.println(value);
            }
        });
    }
}
