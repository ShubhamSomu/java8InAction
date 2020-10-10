package com.binarybeasts.java8inaction.ch3_Lambdas.functions.input_known;

import java.util.function.IntFunction;

// input is int known
public class AnIntFunction {

    public static void main(String[] args) {
        AnIntFunction anIntFunction = new AnIntFunction();
        anIntFunction.worker();
    }

    private static IntFunction<Double> findAbs(){
        return s-> (double) StrictMath.abs(s);
    }

    public void worker(){
        var val = 10;
        System.out.println(AnIntFunction.findAbs().apply(val));
    }
}
