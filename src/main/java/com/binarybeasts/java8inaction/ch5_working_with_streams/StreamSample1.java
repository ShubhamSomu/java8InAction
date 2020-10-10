package com.binarybeasts.java8inaction.ch5_working_with_streams;

import com.binarybeasts.java8inaction.data.dao.Dish;
import com.binarybeasts.java8inaction.data.service.AllInOneService;
import com.binarybeasts.java8inaction.data.setup.TransactionConfig;

import java.util.List;
import java.util.Objects;

import static java.util.stream.Collectors.toList;

public class StreamSample1 {
    private final AllInOneService allInOneService;
    private List<Dish> allDishes = null;
    public StreamSample1(){
        this.allInOneService = Objects.requireNonNull(TransactionConfig.getTransactionService(), "transactionService");
    }

    public static void main(String[] args) {
        StreamSample1 obj = new StreamSample1();
        obj.worker();
    }

    public void worker(){
        allDishes = allInOneService.getAllDishes();
        System.out.println("-- Test Case--\n" + allDishes + "\n------ Test Case ------"+"\n");
        threeHighCalorie(allDishes);
    }

    public void threeHighCalorie(List<Dish> allDishes){
        //WAP find the names of 3 high calorie dishes, dishes with calorie count > 300 are high cal
        System.out.println( allDishes
                .stream()
                .filter(e -> e.getCalories() > 300)
                .map(Dish::getName)
                .limit(3)
                .collect(toList()));
    }


}
