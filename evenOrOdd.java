package Codes;

import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();

        String result = number % 2 == 0 ? "Even" : " Odd";
        System.out.println("Given number is :" + result);

    }

}

/*
 * output
 * Enter the number :
 * 20
 * Given number is :Even
 */