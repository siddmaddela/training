package com.in28minutes.exampleForLoop;

public class PrimeFinderRunner {
    public static void main(String[] args) {
        System.out.println(primeOrNot(9));
    }

    public static boolean primeOrNot(int number){

        if (number<2){
            return false;
        }

        for(int i =2;i<=number-1;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
}