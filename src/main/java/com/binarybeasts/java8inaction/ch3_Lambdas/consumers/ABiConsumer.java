package com.binarybeasts.java8inaction.ch3_Lambdas.consumers;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ABiConsumer {

    private static final List<Double[]> twoSidesOfTriangle = List.of(new Double[] {2.0,3.0}, new Double[] {7.2,9.7},
            new Double[] {8.0,5.1},new Double[] {4.3,3.2},new Double[] {2.4,3.0}, new Double[] {7.6,8.5});

    public static void main(String[] args) {
        ABiConsumer aBiConsumer = new ABiConsumer();
        aBiConsumer.worker();
    }

    private static BiConsumer<Double,Double> findHypotnuse(){
        return (b,h) -> System.out.println(Math.sqrt(Math.pow(b,2) + Math.pow(h, 2)));
    }


    private void worker(){
        twoSidesOfTriangle.forEach(s -> ABiConsumer.findHypotnuse().accept(s[0],s[1]));
    }
}
