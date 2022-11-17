package com.in28minutes.primitivedata;

import java.math.BigDecimal;

public class SimpleInterest {
    BigDecimal principal;
    BigDecimal interest;
    public SimpleInterest(String principal, String interest){
        this.principal = new BigDecimal(principal);
        this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
    }
    public BigDecimal totalValue(int noOfYears){
        BigDecimal noOfYearsBigDecimal = new BigDecimal(noOfYears);
        BigDecimal totalSum = principal.add(principal.multiply(interest.multiply(noOfYearsBigDecimal)));
        return totalSum;
    }
}
