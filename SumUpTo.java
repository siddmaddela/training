package com.in28minutes.exampleForLoop;

public class SumUpTo {
    public static void main(String[] args) {
        SumUpTo number = new SumUpTo();
        int sum = number.sumUpTo(6);
        System.out.println(sum);
    }

    public int sumUpTo(int number){
        int sum = 0;
        for (int i = 1; i<=number; i++){
            sum = sum+i;
        }
        return sum;
    }
}
