package com.binarybeasts.java8inaction.data.service;

import com.binarybeasts.java8inaction.data.dao.Dish;
import com.binarybeasts.java8inaction.data.dao.Transaction;
import com.binarybeasts.java8inaction.data.repository.AllInOneRepository;

import java.util.List;
import java.util.Objects;

public class AllInOneService {

    private final AllInOneRepository allInOneRepository;
    public AllInOneService(AllInOneRepository allInOneRepository){
        this.allInOneRepository = Objects.requireNonNull(allInOneRepository,"transcationRepository");
    }

    public List<Transaction> getAllTransactions(){
        return allInOneRepository.getTransactionList();
    }


//dishes
    public List<Dish> getAllDishes(){
        return allInOneRepository.getDishesList();
    }
}
