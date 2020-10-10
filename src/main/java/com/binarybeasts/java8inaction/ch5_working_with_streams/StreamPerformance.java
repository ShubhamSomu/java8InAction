package com.binarybeasts.java8inaction.ch5_working_with_streams;

import java.util.List;
import java.util.Optional;

public class StreamPerformance {

    private static final List<Integer> testNum = List.of(1,2,3,5,4,6,7);

    // WAP to select first even num, and double it
    // check if perf of imperative = perf of stream

    /**
     * Imperative
     * units of cost : 5 (find the even num) + 1 double = 6
      *
     */
    public int doItImperative(List<Integer> testNum){
        int result = 0;
        for(int i : testNum){
            if(i % 2 == 0){
                result = i * 2;
                break;
            }
        }
        return result;
    }

    /**
     * Functional
     *
     * 7 (find all evens) + 7 double all evens + 1 select first even
     * Wrong thinking !!
     *
     * but its 7 due to lazy eval until terminal op is fired
     *
     */
    public Optional<Integer> doItFunctional(List<Integer> testNum){
        return testNum.stream()
                .filter(e -> e % 2 == 0)
                .map(e -> e * 2)
                .findFirst();
    }

    public void worker(List<Integer> testNum){
        System.out.println("Imperative Style");
        System.out.println(doItImperative(testNum));

        System.out.println("\n\n");
        System.out.println("Functional Style");
        System.out.println(doItFunctional(testNum));
    }
    public static void main(String[] args) {
        StreamPerformance streamPerformance = new StreamPerformance();
        streamPerformance.worker(testNum);
    }
}
