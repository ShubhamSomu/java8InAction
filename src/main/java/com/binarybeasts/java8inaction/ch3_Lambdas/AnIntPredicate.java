package com.binarybeasts.java8inaction.c1_Lambdas;

import com.binarybeasts.java8inaction.data.service.TransactionService;
import com.binarybeasts.java8inaction.data.setup.TransactionConfig;

import java.util.Objects;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class AnIntPredicate {
    private final TransactionService transactionService;
    public AnIntPredicate(){
        this.transactionService = Objects.requireNonNull(TransactionConfig.getTransactionService(),
                "transactionService");
    }

    public static void main(String[] args) {
        AnIntPredicate anIntPredicate = new AnIntPredicate();
        System.out.println("\n**** Number Filter ****");
        anIntPredicate.numberFilter();

        System.out.println("\n**** Is Prime ****");
        anIntPredicate.findPrime();

        System.out.println("\n**** Is Prime and divisible by 3 ****");
        anIntPredicate.findPrimeAndDivisibleBy3();
    }

    private void findPrimeAndDivisibleBy3() {
        IntStream intStream = IntStream.of(100,404,605,902,101,515,3);

        IntPredicate divideBy3 = num -> num % 3 == 0;
        IntPredicate primeAndDivideBy3 = divideBy3.or(AnIntPredicate::isPrime);

        intStream.filter(primeAndDivideBy3).forEach(System.out::println);
    }

    public void numberFilter(){
        IntStream intStream = IntStream.of(100,404,605,902,101,515);

        IntPredicate pricePredicate = price -> price > 500;

        intStream.filter(pricePredicate).forEach(System.out::println);
    }

    public void findPrime(){
        IntStream intStream = IntStream.of(100,404,605,902,101,515);

        intStream.filter(AnIntPredicate::isPrime).forEach(System.out::println);
    }

    public static boolean isPrime(int i){
        IntPredicate isDivisible = index -> i % index == 0;
        return i > 1 && IntStream.range(2, i).noneMatch(isDivisible);
    }

    public static boolean isTester(int i){
        IntPredicate isDivisible = index -> i % index == 0;
        return i > 1 && IntStream.range(2, i).noneMatch(isDivisible);
    }

}
