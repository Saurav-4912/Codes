package Codes;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the year : ");
        int year = sc.nextInt();

        if (year % 400 == 0) {
            System.out.println("Given year is a leap year");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Given year is a leap year");
        } else {
            System.out.println("Given year is not leap year");
        }
    }
}

//output
/*Please enter the year : 
2016
Given year is a leap year */