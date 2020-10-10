package com.binarybeasts.java8inaction.ch3_Lambdas.consumers;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class SimpleConsumer {
    private static final List<String> logList = Arrays.asList("log.debug", "Error occuerd", "something went wrong", "Illegal Arg Exceptions");
    public static void main(String[] args) {
        SimpleConsumer simpleConsumer = new SimpleConsumer();
        simpleConsumer.worker();
    }

    private static Consumer<String> exile(){
        return s -> {};
    }

    private void worker(){
        // simulating /dev/null
        logList.forEach(SimpleConsumer.exile());
    }
}
