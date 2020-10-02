package com.binarybeasts.java8inaction.data.service;

import com.binarybeasts.java8inaction.data.dao.Transaction;
import com.binarybeasts.java8inaction.data.repository.TranscationRepository;

import java.util.List;
import java.util.Objects;

public class TransactionService {

    private final TranscationRepository transcationRepository;
    public TransactionService(TranscationRepository transcationRepository){
        this.transcationRepository = Objects.requireNonNull(transcationRepository,"transcationRepository");
    }

    public List<Transaction> getAllTransactions(){
        return transcationRepository.getTransactionList();
    }
}
