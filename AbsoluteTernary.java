package Codes;

import java.util.Scanner;

public class AbsoluteTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        int result = number >= 0 ? number : -number;
        System.out.println(" Absolute value is :" + result);
    }
}

/*
 * output
 * Enter the number :
 * -89
 * Absolute value is :89
 */