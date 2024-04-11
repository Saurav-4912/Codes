package Codes;

import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int Number = sc.nextInt();

        int result = ~Number;
        System.out.println("Result is : " + result);
    }
}

//output
/*Enter the number :
5
Result is : -6 */