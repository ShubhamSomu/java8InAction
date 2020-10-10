package com.binarybeasts.java8inaction.ch3_Lambdas.predicates;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.function.DoublePredicate;

public class ADoublePredicate {
    public static final double MIN_SALARY_CRITERIA_FOR_COVID_CUT = 30000.78;
    public static final List<Employee> listOfEmployees = List.of(
            new Employee("Shubham", 52013.78),
            new Employee("Vibhor", 30000.23),
            new Employee("Harish", 60000.28),
            new Employee("Sikander", 30000.23));
    public static void main(String[] args) {
        ADoublePredicate aDoublePredicate = new ADoublePredicate();
        aDoublePredicate.worker();
    }

    private static DoublePredicate filterSalary(){
        return d -> d > MIN_SALARY_CRITERIA_FOR_COVID_CUT;
    }

    private void worker(){
        listOfEmployees.stream().mapToDouble(Employee::getSalary).filter(ADoublePredicate.filterSalary()).forEach(System.out::println);
    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Employee {
    private String name;
    private Double salary;
}
