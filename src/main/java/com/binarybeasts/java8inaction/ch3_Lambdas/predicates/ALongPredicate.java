package com.binarybeasts.java8inaction.ch3_Lambdas.predicates;

import java.util.function.LongPredicate;
import java.util.stream.LongStream;

public class ALongPredicate {
    public static void main(String[] args) {
        ALongPredicate aLongPredicate = new ALongPredicate();
        aLongPredicate.runner();
    }

    public static LongPredicate filterPrime() {
        return p -> p % 2 ==0;
    }

    public void runner(){
        LongStream longStream = LongStream.range(1L, 100L);
        longStream.filter(ALongPredicate.filterPrime()).forEach(System.out::println);
    }

}
