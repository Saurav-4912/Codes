package Codes;

import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int Number = sc.nextInt();

        int result = ~Number;
        System.out.println("Result is : " + result);

        //left shift
        int result1= Number << 4;
        System.out.println("Result is : " + result1);

        //right shift
        int result2= Number >> 2;
        System.out.println("Result is : " + result2);
    }
}

//output
/*Enter the number :
4
Result is : -5
Result is : 64
Result is : 1 */