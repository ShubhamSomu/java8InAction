package com.binarybeasts.java8inaction.ch3_Lambdas.functions;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class SimpleFunction {

    private static final List<Integer[]> tripleCandidates = List.of( new Integer[]{3,4,5}, new Integer[]{1,2,3},
            new Integer[] {97,54,21}, new Integer[] {9,40,41});
    public static void main(String[] args) {
        SimpleFunction simpleFunction = new SimpleFunction();
        simpleFunction.worker();
    }

    private static Predicate<Integer[]> isPythagoreanTriples(){
        return (n) -> Math.pow(n[0], 2) + Math.pow(n[1], 2) == Math.pow(n[2], 2) ;
    }

    private static Function<Integer[], String> normaliseTriplets() {
        return n -> "("+ " "+n[0] + "," + " "+n[1] +"," + " "+n[2] + " )";
    }

    private void worker(){
        tripleCandidates.stream().filter(isPythagoreanTriples()).map(normaliseTriplets()).forEach(System.out::println);
    }
}
