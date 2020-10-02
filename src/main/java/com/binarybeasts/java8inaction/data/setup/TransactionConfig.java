package com.binarybeasts.java8inaction.data.setup;

import com.binarybeasts.java8inaction.data.repository.TranscationRepository;
import com.binarybeasts.java8inaction.data.service.TransactionService;

public class TransactionConfig {
    public TransactionConfig(){

    }

    public static TransactionService getTransactionService(){
        TranscationRepository transcationRepository = new TranscationRepository();
        return new TransactionService(transcationRepository);
    }


}
