package com.binarybeasts.java8inaction.ch3_Lambdas.functions.input_known;

import java.util.function.ToDoubleFunction;

//return type is double known
public class AnToDoubleFunction {
    public static void main(String[] args) {
        AnToDoubleFunction anToDoubleFunction = new AnToDoubleFunction();
        anToDoubleFunction.worker();
    }

    private static ToDoubleFunction<Integer> getIncrByTen() {
        return s -> s + 10;
    }

    private void worker(){
        var val = 5;
        System.out.println(AnToDoubleFunction.getIncrByTen().applyAsDouble(val));
    }
}
