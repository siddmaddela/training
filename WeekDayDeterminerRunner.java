package com.in28minutes.ifstatement.examples;

public class WeekDayDeterminerRunner {
    public static void main(String[] args) {
        System.out.println(determineWeekDay(4));
    }

    public static String determineWeekDay(int dayNumber){
        return switch (dayNumber) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid_day";
        };
    }
}
