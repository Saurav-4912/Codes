package Codes;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        System.out.println("Here is the fibonacci series");
       Fibonacci(number);

    }

    public static void Fibonacci(int number) {
        if (number < 0)
            return;
        System.out.print("0 ");
        if (number == 0)
            return;
        System.out.print("1 ");

        int first = 0, second = 1;
        while (first + second <= number) {
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
    }
}

//output
/*Enter the number : 
13
Here is the fibonacci series
0 1 1 2 3 5 8 13  */
