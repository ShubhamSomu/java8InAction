package com.binarybeasts.java8inaction.data.repository;

import com.binarybeasts.java8inaction.data.dao.Dish;
import com.binarybeasts.java8inaction.data.dao.DishType;
import com.binarybeasts.java8inaction.data.dao.Trader;
import com.binarybeasts.java8inaction.data.dao.Transaction;

import java.util.Arrays;
import java.util.List;

public class AllInOneRepository {

    public List<Transaction> getTransactionList(){
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        Trader thomas = new Trader("Thomas","Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950),
                new Transaction(thomas, 2012, 950)
        );

        return transactions;
    }

    public List<Dish> getDishesList(){
        List<Dish> dishList = Arrays.asList(
                new Dish("pork", false, 800, DishType.MEAT),
                new Dish("beef", false, 700, DishType.MEAT),
                new Dish("chicken", false, 400, DishType.MEAT),
                new Dish("french fries", true, 530, DishType.OTHER),
                new Dish("rice", true, 350, DishType.OTHER),
                new Dish("season fruit", true, 120, DishType.OTHER),
                new Dish("pizza", true, 550, DishType.OTHER),
                new Dish("prawns", false, 300, DishType.FISH),
                new Dish("salmon", false, 450, DishType.FISH)
                );
        return dishList;
    }
}
