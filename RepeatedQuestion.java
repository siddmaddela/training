package com.in28minutes.exampleForLoop;

import java.util.Enumeration;
import java.util.Scanner;

public class RepeatedQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = -1;
        do {
            if (number != -1) {
                System.out.println("cube is " + (number * number * number));
            }
            System.out.print("enter a number: ");
            number = scanner.nextInt();
        } while (number >= 0);
        System.out.println("thank you and have fun!");
    }
}
