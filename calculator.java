package Codes;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int number1 = sc.nextInt();
        System.out.println("Enter the second number :");
        int number2 = sc.nextInt();
        System.out.println("Enter the operation : ");
        String operation = sc.next();

        int result = switch (operation) {
            case "+" -> number1 + number2;
            case "-" -> number1 - number2;
            case "*" -> number1 * number2;
            case "/" -> number1 / number2;
            default -> -1;
        };

        System.out.println("Your answer is : " + result);
    }
}

/*
 * output Enter the first number :
 * 12
 * Enter the second number :
 * 15
 * Enter the operation :
 * +
 * Your answer is : 27
 */