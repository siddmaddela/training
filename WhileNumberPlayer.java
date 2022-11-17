package com.in28minutes.exampleForLoop;

public class WhileNumberPlayer {
    public static void main(String[] args) {
        WhileNumberPlayer number = new WhileNumberPlayer();
        number.squaresUpTo(100);
    }

    public void squaresUpTo(int number){
        int i = 0;
        while (i*i <= number) {
            System.out.print(i*i + " ");
            i++;
        }
    }
}
