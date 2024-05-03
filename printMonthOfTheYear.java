package Codes;

import java.util.Scanner;

public class printMonthOfTheYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your month number  : ");
        int monthNumber = sc.nextInt();

        String monthName = getMonthNumber(monthNumber);
        System.out.println("Your month name is : " + monthName);

    }

    public static String getMonthNumber(int monthNumber) {
        String monthName = switch (monthNumber) {
            case 1 -> "january";
            case 2 -> "Febuary";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "Octomber";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month";
        };
        return monthName;
    }
}

/*
 * output
 * please enter your month number :
 * 5
 * Your month name is : May
 */