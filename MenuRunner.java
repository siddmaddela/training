package com.in28minutes.ifstatement.examples;

import java.util.Scanner;

public class MenuRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter first number: ");
        int number1 = scanner.nextInt();
        System.out.println("the number you first entered is " + number1);
        System.out.print("enter second number: ");
        int number2 = scanner.nextInt();
        System.out.println("the number you second entered is " + number2);
        System.out.println("choices available are:");
        System.out.println("add - 1");
        System.out.println("subtract - 2");
        System.out.println("divide - 3");
        System.out.println("multiply - 4");
        System.out.print("enter your choice: ");
        int choice = scanner.nextInt();
        System.out.println("you choice is " + choice);

        PerformingNestedIf(number1, number2, choice);
    }

    private static void PerformingNestedIf(int number1, int number2, int choice) {
        if (choice ==1){
            System.out.println("result is: " + (number1 + number2));
        }
        else if (choice ==2){
            System.out.println("result is: " + (number1 - number2));
        } else if (choice ==3){
            System.out.println("result is: " + (number1 / number2));
        } else if (choice ==4){
            System.out.println("result is: " + (number1 * number2));
        } else{
            System.out.println("and that's an invalid choice");
        }
    }

    private static void PerformingSwitch(int number1, int number2, int choice) {
        switch (choice) {
            case 1 -> System.out.println("result is: " + (number1 + number2));
            case 2 -> System.out.println("result is: " + (number1 - number2));
            case 3 -> System.out.println("result is: " + (number1 / number2));
            case 4 -> System.out.println("result is: " + (number1 * number2));
            default -> System.out.println("and that's an invalid choice");
        }
    }
}
