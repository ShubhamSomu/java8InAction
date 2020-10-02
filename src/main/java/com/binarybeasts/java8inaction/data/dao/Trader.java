package com.binarybeasts.java8inaction.data.dao;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Trader{
    private final String name;
    private final String city;
    public Trader(String n, String c){
        this.name = n;
        this.city = c;
    }
}
