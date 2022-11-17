package com.in28minutes.primitivedata;

import java.math.BigDecimal;

public class SimpleInterestRunner {
    public static void main(String[] args) {
        SimpleInterest calculator = new SimpleInterest("4500.00", "7.5");
        BigDecimal totalAmount = calculator.totalValue(5);
        System.out.println(totalAmount);
    }
}
