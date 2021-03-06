package com.binarybeasts.java8inaction.ch3_Lambdas.predicates;

import com.binarybeasts.java8inaction.data.dao.Transaction;
import com.binarybeasts.java8inaction.data.service.AllInOneService;
import com.binarybeasts.java8inaction.data.setup.TransactionConfig;

import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SamplePredicate {

    private final AllInOneService allInOneService;

    public SamplePredicate(){
        this.allInOneService = Objects.requireNonNull(TransactionConfig.getTransactionService(),
                "transactionService");
    }
    public static void main(String [] args){
        SamplePredicate samplePredicate = new SamplePredicate();
        samplePredicate.warmUp().forEach(System.out::println);
    }

    public List<Transaction> warmUp(){
        List<Transaction> allTransactions = allInOneService.getAllTransactions();

        Transaction t = new Transaction();

        Predicate<Transaction> namePredicate = transaction -> transaction.getTrader().getName().contains("T");

        return filterTransactions(allTransactions, namePredicate);
    }

    public List<Transaction> filterTransactions(List<Transaction> allTransactions, Predicate<Transaction> predicate){
       return allTransactions.stream().filter(predicate).collect(Collectors.toList());
    }
}
