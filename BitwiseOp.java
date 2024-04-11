package Codes;

import java.util.Scanner;

public class BitwiseOp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter first number : ");
        int FirstNumber=sc.nextInt();
        System.out.println("Please enter other number :");
        int SecondNumber=sc.nextInt();
        
        //AND
        int result1= FirstNumber &  SecondNumber;
        System.out.println("Result is : " +result1);
        
        //OR
        int result2= FirstNumber | SecondNumber;
        System.out.println("Result is : " +result2);

        //XOR
        int result3=FirstNumber ^ SecondNumber;
        System.out.println("Result is : " +result3);

    }
}

//output
/*Please enter first number : 
12
Please enter other number :
9
Result is : 8
Result is : 13
Result is : 5 */