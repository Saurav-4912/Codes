package Codes;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        boolean isPrime = isPrime(number);
        if (isPrime) {
            System.out.println("Your number is prime");
        } else {
            System.out.println("Your number is not prime");
        }
    }

    public static boolean isPrime(int number) {
        int i = 2;
        while (i < number) {
            if (number % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}

//output
/*Enter the number : 
13
Your number is prime */