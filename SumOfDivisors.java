package com.in28minutes.exampleForLoop;

public class SumOfDivisors {
    public static void main(String[] args) {
        SumOfDivisors number = new SumOfDivisors();
        int sum = number.sumOfDivisors(6);
        System.out.println(sum);
    }

    private static int sumOfDivisors(int number) {
        int sum = 0;
        for (int i = 2; i<number; i++){
            if ( number%i==0){
                sum = sum + i;
            }
        }
        return sum;
    }
}
