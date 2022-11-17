package com.in28minutes.ifstatement.examples;

public class WeekDayFinderRunner {
    public static void main(String[] args) {
        System.out.println(isWeekDay(3));
    }

    public static boolean isWeekDay(int dayNumber) {
        return switch (dayNumber) {
            case 1, 2, 3, 4, 5 -> true;
            default -> false;
        };
    }
}
