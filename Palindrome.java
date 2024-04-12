package Codes;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        boolean isPalindrome = isPalindrome(number);
        if (isPalindrome) {
            System.out.println("Your number is a palindrome");
        } else {
            System.out.println("Your number is not a palindrome");
        }
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reverseNumber = 0;
        while (number > 0) {
            int remainder = number % 10;
            reverseNumber = (reverseNumber * 10) + remainder;
            number /= 10;
        }
        return originalNumber == reverseNumber;

    }

}

//output
/*Enter the number : 
121
Your number is a palindrome */
