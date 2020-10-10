package com.binarybeasts.java8inaction.data.dao;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Dish {
    private String name;
    private boolean isVegitarian;
    private Integer calories;
    private DishType type;
}