package com.in28minutes.exampleForLoop;

public class NumberTriangle {
    public static void main(String[] args) {
        NumberTriangle number = new NumberTriangle();
        number.printNumberTriangle(6);

    }

    public void printNumberTriangle(int number) {
        for (int i =1; i<=number; i++){
            for (int j=1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
