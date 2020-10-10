package com.binarybeasts.java8inaction.data.setup;

import com.binarybeasts.java8inaction.data.repository.AllInOneRepository;
import com.binarybeasts.java8inaction.data.service.AllInOneService;

public class TransactionConfig {
    public TransactionConfig(){

    }

    public static AllInOneService getTransactionService(){
        AllInOneRepository allInOneRepository = new AllInOneRepository();
        return new AllInOneService(allInOneRepository);
    }


}
