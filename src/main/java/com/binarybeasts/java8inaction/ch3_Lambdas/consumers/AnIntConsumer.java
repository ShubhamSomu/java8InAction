package com.binarybeasts.java8inaction.ch3_Lambdas.consumers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.IntConsumer;

public class AnIntConsumer {
    private static List<Integer> piggyBank = new ArrayList<>();
    private static final List<Integer> receivedMoney = List.of(101, 501, 101, 1001, 2001, 1001, 101, 1);
    public static void main(String[] args) {
        AnIntConsumer anIntConsumer = new AnIntConsumer();
        anIntConsumer.worker();
    }

    private static IntConsumer consumePenny(){
        IntConsumer addMoneyToPiggyBank = s -> piggyBank.add(s);
        return addMoneyToPiggyBank;
    }

    private static Optional<Integer> display(){
        return piggyBank.stream().reduce(Integer::sum);
    }

    private void worker(){
        // there was a cermony at the house , relatives gave a lot of 'chungi', let's save it

        receivedMoney.stream().mapToInt(m -> (int)m).forEach(consumePenny());
        System.out.println("Total Money collected : " + display().get());
    }
}
