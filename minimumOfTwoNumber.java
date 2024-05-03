package Codes;

import java.util.Scanner;;

public class minimumOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int number1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        int number2 = sc.nextInt();
        minimumOfTwoNumber ternary = new minimumOfTwoNumber();
        int min = ternary.min(number1, number2);
        System.out.println("minimum number is " + min);

    }

    public int min(int number1, int number2) {
        int minimumOfTwoNumber = number1 < number2 ? number1 : number2;
        return minimumOfTwoNumber;

    }
}

/*
 * output
 * Enter the first number :
 * 12
 * Enter the second number :
 * 11
 * minimum number is 11
 */
