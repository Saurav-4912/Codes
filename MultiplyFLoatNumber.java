package Codes;

import java.util.Scanner;

public class MultiplyFLoatNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first decimal point : ");
        float FirstNumber=sc.nextFloat();
        System.out.println("Enter the secomnd decimal number : ");
        float SecondNumber=sc.nextFloat();

        double Multiplication=FirstNumber * SecondNumber;
        System.out.println( "Multiplication of two decimal number : " +Multiplication);
    }
}

//output
/*Enter the first decimal point : 
12.5
Enter the secomnd decimal number : 
15.5
Multiplication of two decimal number : 193.75 */
